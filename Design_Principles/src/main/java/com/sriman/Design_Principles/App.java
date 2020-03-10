package com.sriman.Design_Principles;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value:");
        float operand1=sc.nextFloat();
        System.out.println("Enter second value:");
        float operand2=sc.nextFloat();
        System.out.println("Enter any four operations:");
        String variable=sc.next();
        if(variable.equals("+")){
            Addition add = new Addition(operand1, operand2);
            System.out.println(add.Add(operand1,operand2));
        }
        else if(variable.equals("-")){
            Subtraction sub = new Subtraction(operand1,operand2);
            System.out.println(sub.SUB(operand1,operand2));
        }
        else if(variable.equals("*")){
            Multiplication mul = new Multiplication(operand1,operand2);
            System.out.println(mul.Mul(operand1,operand2));
        }
        else if(variable.equals("/")){
            Division div = new Division(operand1,operand2);
            System.out.println(div.Div(operand1,operand2));
        }
        else{
            System.out.println("No operation in this calculator..");
        }
        
    }
}