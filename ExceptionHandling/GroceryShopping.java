import java.util.*;

public class GroceryShopping{
	public static void main(String args[]){
		try{
			ProductName pn = new ProductName();
			pn.selectProduct();   
		}
		catch (MyException e){			
			System.out.println("Product Error,  " + e);	
		}		
	}
}

