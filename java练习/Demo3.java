import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n = sc.nextInt();
	int A[] = new int[n];
	for(int i=0;i<n;i++) {
		A[i] = sc.nextInt();
	}
	int a = sc.nextInt();
	int B[] = new int[a];
	for(int i=0;i<a;i++) {
		B[i] = sc.nextInt();
	}
	Arrays.sort(A);
	Arrays.sort(B);
	int s1=0;
	int i=n-1,j=a-1;
	while(i>=0&&j>=0) {
			if(B[j]>=A[i]) {
				s1=s1+1;
				i=i-1;
				j=j-1;
			}else {
				i=i-1;
			}
	}
	
	System.out.println(s1);
}
}
