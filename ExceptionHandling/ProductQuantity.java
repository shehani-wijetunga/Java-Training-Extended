import java.util.*;
import java.util.Scanner;

public class ProductQuantity{
	public void getQuantity() throws MyException
	{	
		Scanner s = new Scanner(System.in);
		System.out.println("Enter quantity : ");
		int quantity = s.nextInt();

		if(quantity<=0){
			throw new MyException("Product quantity cannot be 0..");
		}

		ProductPrice pp = new ProductPrice();
		pp.calculatePrice(quantity);
	}
}
