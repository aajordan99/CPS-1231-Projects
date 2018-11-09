import java.util.Scanner;
public class Random{ 
 
 	//Before running this program, predict what will print
//	I think this program tests parameters of a method.
     public static void changePrimitive (int f1) 
    { 
        f1 = 999; 
        //Note that the value of f1 is changed in the method         System.out.println("f1 = " + f1); 
    } 
   
    public static void main (String [] args) 
    {          
        int a1 =111; 
        //Q1. what prints after the statement below runs? 
        System.out.println("before calling changePrimitive a1 = "+a1); 
 
        changePrimitive(a1); 
 
        //Q2. What prints after the statement below runs?  
        System.out.println("after calling changePrimitive a1 = "+a1);         //Q3.  why did the value of a1 not change? 
    } 
} 

