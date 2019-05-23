import java.util.Arrays;
import java.util.Scanner;

public class Demo6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int A[] = new int [n];
	for(int i=0;i<n;i++) {
		A[i] = sc.nextInt();
	}
	Arrays.sort(A);
	int s=0;
	for(int i=1;i<A.length-1;i++) {
		if(A[i+1]-A[i]==A[i]-A[i-1]) {
			s=s+0;
		}else
			s=s+1;
	}
	if(s==0) {
		System.out.println("Possible");
	}else
		System.out.println("Impossible");
}	
}
