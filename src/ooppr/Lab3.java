
package ooppr;
import java.util.*;
public class Lab3 {
    static Scanner in=new Scanner(System.in);
    public static void question1(){    
        float length,breadth;
        System.out.println("Enter the length of the rectangle:");
        length=in.nextFloat();
        System.out.println("Enter the breadth of the rectangle:");
        breadth=in.nextFloat();
        if(length==breadth){
            System.out.println("It is a square");
        }else{
            System.out.println("It is not a square");
        }
    
    }
    public static void question2(){
        int marks;
        System.out.println("Enter the marks:");
        marks=in.nextInt();
        if (marks>=80) {
            System.out.println("A");
        } else if(marks>60 && marks<80) {
            System.out.println("B");
        } else if(marks>50 && marks<=60){
            System.out.println("C");
        } else if(marks>45 && marks<=50){
            System.out.println("D");
        } else if(marks>25 && marks<=45){
            System.out.println("E");
        }else{
            System.out.println("F");
        }
    }
    public static void question3(){
        int held,attendedno;
        double attendedper;
        System.out.println("Enter the number of classes held:");
        held=in.nextInt();
        System.out.println("Enter the number of classes attended:");
        attendedno=in.nextInt();
        attendedper = (float) attendedno / held * 100;
        System.out.println("Class attended percentage: " + attendedper);
        if (attendedper>=75) {
            System.out.println("Allowed");
        } else {
            System.out.println("Not Allowed");
        }
    }
    public static void question4(){
        int no1,no2,no3;
        System.out.println("Enter 1st number:");
        no1=in.nextInt();
        System.out.println("Enter 2nd number:");
        no2=in.nextInt();
        System.out.println("Enter 3rd number:");
        no3=in.nextInt();
        
        if (no1>no2 && no1>no3) {
            System.out.println("Number 1 is the largest which is "+no1);
        } else if(no2>no1 && no2>no3){
            System.out.println("Number 2 is the largest which is "+no2);
        } else{
            System.out.println("Number 3 is the largest which is "+no3);
        }
    }
    public static void question5(){
        int asciivalue,randomno;
        randomno=1+(int)(Math.random()*(25-1)+1);
        
    }
    public static void main(String args[]){
        question2();
    }
}
