package ooppr;
import java.util.*;
public class Lab2 { //Code needs to be changed
    static Scanner in=new Scanner(System.in);
    public static void question1() {
        System.out.print("Enter value in Inches:");
        float inch=in.nextFloat();
        double meters=inch*0.0254;
        System.out.println(inch+" inches is "+meters+" meters.");
        
    }
    public static void question2(){
        System.out.print("Enter number of days:");
        int day, month, days;
        day = in.nextInt();
        month = day / 30;
        days = day % 30;
        System.out.println(day + " days is " + month + " months " + days + " days.");
    }
    public static void question3(){
        System.out.println("Enter your weight in lbs:");
        float lbs= in.nextFloat();
        System.out.println("Enter your 1st part of height in inch");
        float inch= in.nextFloat();
        double kg=lbs*0.45359237;
        double meters=inch*0.0254;
        double bmi=kg/Math.pow(meters,2);
        System.out.printf("\nThe BMI of "+lbs+" lbs, "+inch+" inch height is %.2f%n",bmi);
    }
    public static void question4(){
        System.out.println("Enter your name:");
        String name=in.nextLine();
        System.out.println("Enter your age:");
        int age=in.nextInt();
        in.nextLine();
        System.out.println("Enter your gender:");
        String gender=in.nextLine();
        System.out.println("Enter your department:");
        String dep=in.nextLine();
        System.out.println("Enter your email id:");
        String email=in.nextLine();
        System.out.println("Enter your father name:");
        String fname=in.nextLine();
        
        System.out.printf("Hello %s. Here is your BIO DATA\n",name);
        System.out.println("-----BIO-DATA-----");
        System.out.printf("Name:%s\nAge:%d\nGender:%s\nDepartment:%s\nEmail id:%s\nFather's Name:%s",name,age,gender,dep,email,fname); 
    }
    public static void question5(){
         System.out.print("Enter your first number:");
        int no1=in.nextInt();
        System.out.print("Enter your second number:");
        int no2=in.nextInt();
        int sum=no1+no2;
        int min=no1-no2;
        System.out.printf("The sum of %d and %d is %d\n",no1,no2,sum);
        System.out.printf("The differnce between %d and %d is %d",no1,no2,min);
    }
    public static void question6(){
        System.out.println("Enter a three digit number:");
        int no,digit1,digit2,digit3,sum;
        no=in.nextInt();
        digit1=no/100;
        digit2=no/10%10;
        digit3=no%10;
        sum=digit1+digit2+digit3;
        System.out.printf("%d+%d+%d=%d",digit1,digit2,digit3,sum);
    }
    
    public static void main(String[] args){
        question6();
        question2();
        in.close();
    }
    
}


