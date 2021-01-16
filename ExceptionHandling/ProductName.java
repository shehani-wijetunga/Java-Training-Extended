import java.util.*;
import java.util.Scanner;

public class ProductName{
	public void selectProduct() throws MyException
	{		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a product : ");
		String product = sc.nextLine();
	
		if(product == null || product == ""){
			throw new MyException("Product name is not found..");
		}

		ProductQuantity pq=new ProductQuantity();
		pq.getQuantity();		
	}
}
