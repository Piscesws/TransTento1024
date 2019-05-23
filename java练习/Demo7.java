import java.util.Arrays;
import java.util.Scanner;

public class Demo7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.nextLine();
	String[] A = a.split("");
	int s1=1;
	int s2=1;
	for(int i=0;i<a.length()-1;i++) {
		if(A[i].equals(A[i+1])) {
			s1=1;
		}else {
			s1=s1+1;
			if(s1>s2) {
				s2=s1;
			}
		}
		
	}
	System.out.println(s2);
}
}
