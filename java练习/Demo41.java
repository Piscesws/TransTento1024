import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.Signer;
import java.util.ArrayDeque;
import java.util.Scanner;


public class Demo41 {
	static int a1;static int a2;
	static char[][] A;
	static int[][] direction = {{-1,0},{0,1},{1,0},{0,-1}};
public static   void main(String[] args) throws IOException{
	Scanner sc = new Scanner(System.in);
	//BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
   // String[] B = sc.readLine().split("\\s");
	String n = sc.nextLine();
	String B[] = n.split(" ");
	a1 = Integer.parseInt(B[0]);
	a2 = Integer.parseInt(B[1]);
	
	A  =  new char[a1][a2];
	for(int i=0;i<a1;i++) 
		//A[i] = sc.readLine().toCharArray();
		A[i] = sc.nextLine().toCharArray();
	 Node result = null;
	 int row = 0;
	 for(char[] r:A){
		 int col = 0;
         for(char c:r){
             if(c=='2'){
                 result = bfs(row,col);
                 break;
             }
             col++;
         }
         row++;
     }
     System.out.println(result.step);
 }//Ѱ��ð�ռҵ�ǰλ��
	public static class Node{
		static boolean[][][] visit;
		int keys;
        int step;
        int col;
        int row;
        public Node(int row,int col,int keys,int step){
            this.col = col;
            this.row = row;
            this.keys = keys;
            this.step = step;
            if(visit==null)
                visit = new boolean[a1][a2][1024];
        }
        public String toString(){
            return A[row][col]+"";
        }
	}
	public static Node bfs(int row,int col) {
		ArrayDeque<Node> queue = new ArrayDeque();
		queue.add(new Node(row,col,0,0));
		Node.visit[row][col][0] = true;
		while(!queue.isEmpty()) {
			Node node = queue.pop();
			for(int i=0;i<direction.length;i++) {
				int nrow = node.row + direction[i][0];
                int ncol = node.col + direction[i][1];
                if(nrow<0||nrow>=a1||ncol<0||ncol>=a2||A[nrow][ncol]=='0')
                	continue;
                char c = A[nrow][ncol];
                if(c=='3') 
                	return new Node(nrow,ncol,node.keys,node.step+1);
                
                if(c<='Z'&&c>='A'&&(node.keys&(1<<c-'A'))==0)
                	continue;
                //������ţ�����û��Կ�ף����ӹ�
                int keys = node.keys;
               
                if(c<='z'&&c>='a')
                    keys = keys|(1<<c-'a');
                //������ͬ��Կ����ʱ������������
                //ֻ���õ��µ�Կ�ף������ж����������Ч·��������������
                if(!Node.visit[nrow][ncol][keys]){
                    Node.visit[nrow][ncol][keys] = true;
                    queue.add(new Node(nrow,ncol,keys,node.step+1));
                }
                
			}
		}
		return null;
		
	}
	
	
}

