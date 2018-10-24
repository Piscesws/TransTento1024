package To1024;

import java.math.BigDecimal;

public class tento {
public static void main(String[] args) {
	String number = "987654654654987465413498746541349846546547987987987987987987654651321684987987654651389749684654561321654648979846498651399999999999999999999999999999998788888884544564321321321321321549";
	BigDecimal big = new BigDecimal(number);
	String number1 = "1";
	BigDecimal a = new BigDecimal(number1);
	String number2 = "1";
	BigDecimal b = new BigDecimal(number2);
	BigDecimal c;
	String number3 = "0";
	BigDecimal d = new BigDecimal(number3);
	do {
		a=a.add(b);
		c=big.remainder(a);
	}while(c.compareTo(d)!=0);
	System.out.println(big.divide(a));
	System.out.println(a);
	
}
}
