package com.epam.task;
import java.util.*;
public class Calculator {
	

	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	        int x = sc.nextInt();
	        int p = sc.nextInt();
	        int q = sc.nextInt();
	        switch (x){
	            case 1:
	                Addition add = new Addition();
	                add.addition(p,q);
	            case 2:
	                Substract sub = new Substract();
	                sub.subtraction(p,q);
	            case 3:
	                Multiplication mul = new Multiplication();
	                mul.multi(p,q);
	            case 4:
	                Division div = new Division();
	                div.division(p,q);
	        }
	    }
}

