
package ooppr;
import java.util.*;
public class Lab7 {
    static Scanner in=new Scanner(System.in);
    
    public static void Question1(){
        String s1,s2,s3;
        System.out.print("Enter a string:");
        s1=in.nextLine();
        System.out.print("Enter a sring to cancat with:");
        s2=in.nextLine();
        s3=s1.concat(s2);
        System.out.println("The String after cocatenation is: "+s3);
    }
    public static void Question2(){
        String s1,s2;
        int s3;
        System.out.print("Enter a string:");
        s1=in.nextLine();
        System.out.print("Enter a sring to compare with:");
        s2=in.nextLine();
        s3=s1.compareTo(s2);
        System.out.println("The String after comparison is: "+s3);
    }
    public static void Question3(){
        String s1,s2;
        boolean s3;
        System.out.print("Enter a string 1:");
        s1=in.nextLine();
        System.out.print("Enter a sring 2 to check if it is equal or not with string 1:");
        s2=in.nextLine();
        s3=s1.equals(s2);
        System.out.println("Is the string 1 equal to string 2: "+s3);
    }
    public static void Question4(){
        String s1;
        int s3;
        System.out.print("Enter a string to check the length of:");
        s1=in.nextLine();
        s3=s1.length();
        System.out.println("The length is: "+s3);
    }
    public static void Question5(){
        String s1,s2,s3;
        System.out.print("Enter a string to convert into upper case:");
        s1=in.nextLine();
        s3=s1.toUpperCase();
        System.out.println("Upper Case: "+s3);
    }
    public static void Question6(){
        StringBuffer s=new StringBuffer();
        String s1,s2;
        System.out.println("Enter first string:");
        s1=in.nextLine();
        System.out.println("Enter second string:");
        s2=in.nextLine();
        s.append(s1);
        s.append(s2);
        System.out.println("The concatenated string is "+s.toString());
        s.reverse();
        System.out.println("Reversed string is "+s.toString());
    }
    public static void Question7(){
        StringBuilder s=new StringBuilder("Java is ");
        s.insert(8, "awesome", 0, "awesome".length());
        System.out.println("The string now is:"+s);
        s.replace(8,16, "powerful");
        System.out.println("The string now is:"+s);
    }
    public static void main(String[] args) {
        Question7();
    }
}
