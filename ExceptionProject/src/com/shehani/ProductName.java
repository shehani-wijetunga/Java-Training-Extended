package com.shehani;
import java.util.*;
import com.shehani.exceptions.*;
import java.util.Scanner;

public class ProductName{
	public void selectProduct() throws Exception
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a product : ");
		//String product = sc.nextLine();

	//	if(product == null || product == ""){
		//	throw new ProductNotFOundException("Product name is not found..");
	//	}
try{
		ProductQuantity pq=new ProductQuantity();
			pq.getQuantity();
	}catch(QuantityNotValidException e){
			throw new ProductNotFoundException("Product name is not found..",e);
	}
	}
}
