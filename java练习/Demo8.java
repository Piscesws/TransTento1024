import java.util.Scanner;

public class Demo8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] A = new int [n];
	for(int i=0;i<n;i++) {
		A[i] = sc.nextInt();
	}
	int[] B = new int[n];
	int[] C = new int[n];
	for(int i=0;i<A.length;i++) {
		B[i]=A[i];
		for(int j=0;j<=i;j++) {
			C[j] = B [i-j];
		}
		for(int j=0;j<=i;j++) {
			B[j] = C[j];
		}
	}
	for(int i=0;i<A.length;i++) {
		System.out.print(B[i]+" ");
	}

	
	
	

	
	
}
}
