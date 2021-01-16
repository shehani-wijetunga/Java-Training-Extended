import java.util.*;
import java.util.Scanner;

public class PriceDiscount{
	public void getDiscount(double price) throws MyException
	{
        
        	double discount = 0.1;
        	double finalPrice = price-(price*discount);

        	if(finalPrice<=0){
			throw new MyException("Discount cannot be 0");
		}
		
        	System.out.println("Calculate final price : "+ finalPrice);
	}
}
