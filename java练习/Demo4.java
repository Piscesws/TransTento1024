import java.util.*;
import java.io.*;
public class Demo4{
    static int rows;static int cols;static char[][] maze;
    static int[][] direction = {{-1,0},{0,1},{1,0},{0,-1}};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] rowAndCol = br.readLine().split("\\s");
        rows = Integer.parseInt(rowAndCol[0]);
        cols = Integer.parseInt(rowAndCol[1]);
        maze = new char[rows][cols];
        for(int i=0;i<rows;i++)
            maze[i] = br.readLine().toCharArray();
        Node result = null;
        int row = 0;
        for(char[] r:maze){
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
    }//Ѱ��ð�ռҵ�ǰλ��,����������
    public static Node bfs(int row,int col){
        ArrayDeque<Node> queue = new ArrayDeque();
        queue.add(new Node(row,col,0,0));
        Node.visit[row][col][0] = true;
        while(!queue.isEmpty()){
            Node node = queue.pop();
            for(int i=0;i<direction.length;i++){
                //�鿴ÿ���ڵ�����ڽڵ��Ƿ��ܹ��½�
                int nrow = node.row + direction[i][0];
                int ncol = node.col + direction[i][1];
                if(nrow<0||nrow>=rows||
                   ncol<0||ncol>=cols||
                   maze[nrow][ncol]=='0')continue;
                char c = maze[nrow][ncol];
                if(c=='3')return new Node(nrow,ncol,node.keys,node.step+1);
                  
                if(c<='Z'&&c>='A'&&
                   (node.keys&(1<<c-'A'))==0)continue;
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
      
    static class Node{
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
                visit = new boolean[rows][cols][1024];
        }
        public String toString(){
            return maze[row][col]+"";
        }
    }
}