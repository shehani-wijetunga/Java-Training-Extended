import java.util.*;
import java.util.Scanner;

public class ProductPrice{
	public void calculatePrice(int quantity) throws MyException
	{
        	double unitPrice = 100.00;
		double total = unitPrice*quantity;
		
		if(total <= 0){
			throw new MyException("Price is not found..");
		}
		
		System.out.println("Calculate price : "+ total);
		
		PriceDiscount pd=new PriceDiscount();
		pd.getDiscount(total);
	}			
}
