import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Demo5 {
public static void main(String[] args) throws IOException{
	Scanner sc = new Scanner(System.in);
	String n = sc.nextLine();
	String A[] = n.split("");
	Arrays.sort(A);
	int s=1;
	for(int i=0;i<A.length-1;i++) {
		if(A[i].equals(A[i+1]))
			s=s+0;
		else
			s=s+1;
	}
	System.out.println(s);
	int r=1;
	if(s<=2) {
		System.out.println(s);
	}
	else
		System.out.println(0);
}
}
