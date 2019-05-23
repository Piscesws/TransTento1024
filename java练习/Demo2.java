import java.math.BigDecimal;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
		String A[] = a.split(" "); 
		BigDecimal s1 =new BigDecimal(A[0]);
		BigDecimal s2 =new BigDecimal(A[1]);
		System.out.println(s1.multiply(s2));
	}
}