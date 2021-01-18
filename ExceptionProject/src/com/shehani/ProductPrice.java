package com.shehani;
import java.util.*;
import com.shehani.exceptions.*;
import java.util.Scanner;

public class ProductPrice{
	public void calculatePrice() throws Exception
	{
    //    	double unitPrice = 100.00;
	//	double total = unitPrice*quantity;

	//	if(total <= 0){
	//		throw new MyException("Price is not found..");
	//	}

	//	System.out.println("Calculate price : "+ total);
	try{
		PriceDiscount pd=new PriceDiscount();
		pd.getDiscount();
	}catch(DiscountNotAvailableException e){
		throw new InvalidPriceException("Price is not found..",e);
	}
	}
}
