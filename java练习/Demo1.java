import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int A[] = new int[n] ;
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
			}
		long a=Integer.MIN_VALUE,b=Integer.MIN_VALUE,c=Integer.MIN_VALUE,d=Integer.MAX_VALUE,e=Integer.MAX_VALUE;
		for(long i : A ) {
			if(i>a) {
				c=b;
				b=a;
				a=i;
			}else if(i>b) {
				c=b;
				b=i;
			}else if(i>c) {
				c=i;
			}
			
			if(i<d) {
				e=d;
				d=i;
			}else if(i<e){
				e=i;
			}
			
		}
		long s1=a*b*c;
		long s2=d*e*a;
		long s;
		if(s1>s2)
			s=s1;
		else
			s=s2;
		System.out.println(s);
		
		
		
		
		/*Arrays.sort(A);
		long s;
		int a=A[A.length-1];
		int b=A[A.length-2];
		int c=A[A.length-3];
		int d=A[0];
		int e=A[1];
		long s1=a*b*c;
		long s2=d*e*a;
		if(s1>s2)
			s=s1;
		else
			s=s2;
		System.out.println(s);*/
	}
}

