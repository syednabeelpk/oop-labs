package ooppr;
import java.util.*;
public class Question {
    public static void q1(String[] args){
        Scanner in= new Scanner (System.in);
        char choice;
        
        System.out.print("Enter what do you wnat to do:\na. Add two numbers.\nb. Find power using math funtion\nc. Exit ");
        choice=in.next().charAt(0);
        switch(choice){
            case 'a':
                double no1,no2;
                System.out.print("Enter the first number:");
                no1=in.nextDouble();
                System.out.print("Enter the second number:");
                no2=in.nextDouble();
                System.out.println(no1+"+"+no2+"="+(no1+no2));
                break;
            case 'b':
                double n1,n2,ans;
                System.out.print("Enter a number (base):");
                n1=in.nextDouble();
                System.out.println("Enter the power:");
                n2=in.nextDouble();
                ans=Math.pow(n1,n2);
                System.out.println("The power "+n2+" of "+n1+" is "+ans);
                break;
            case 'c':
                System.out.println("EXITING..");
                break;
            
            }
        
        in.close();
    }
}
