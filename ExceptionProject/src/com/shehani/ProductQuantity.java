package com.shehani;
import java.util.*;
import com.shehani.exceptions.*;
import java.util.Scanner;

public class ProductQuantity{
	public void getQuantity() throws Exception
	{
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter quantity : ");
//		int quantity = s.nextInt();

	//	if(quantity<=0){
	//		throw new MyException("Product quantity cannot be 0..");
	//	}
try{
		ProductPrice pp = new ProductPrice();
		pp.calculatePrice();
	}catch(InvalidPriceException e){
		throw new QuantityNotValidException("Product quantity cannot be found..",e);
			}
	}
}
