package ooppr;
import java.util.*;
public class Lab4 { //Code needs to be changed
    static Scanner in=new Scanner(System.in);
    public static void question1() {
        char choice;
        
        System.out.print("Enter what do you wnat to do:\na. Add two numbers.\nb. Find power using math funtion\nc. Exit \n");
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
        
    }
    public static void question2(){
        char choice;
        int item,subitem;
        double total=0;
        
        System.out.print("Enter which category do you want to buy from:\na. Electronics\nb. Groceries\nc. Clothing\n");
        choice=in.next().charAt(0);
        switch(choice){
            case 'a':
                System.out.print("Enter how many Electronics do you want to buy:");
                item=in.nextInt();
                System.out.print("1.Laptop: 55,000/-\n2.Phone:50,000/-\n3.TV:75,000/-\n4.PC:165,000\n(enter the item number to add to cart)\n");
                for(int i=1;i<=item;i++){
                    System.out.println("Enter your item "+i);
                    subitem=in.nextInt();
                    switch(subitem){
                        case 1:
                            total+=55000;
                            break;
                        case 2:
                            total+=50000;
                            break;
                        case 3:
                            total+=75000;
                            break;
                        case 4:
                            total+=165000;
                            break;
                        default:
                            System.out.println("No item listed for your entered value. 0 value added");
                    }
                }
                System.out.println("The total for your items is "+total);
                break;
            case 'b':
                System.out.print("Enter how many Groceries do you want to buy:");
                item=in.nextInt();
                System.out.print("1.Apple:200/-\n2.Milk:300/-\n3.Eggs(12):350/-\n4.Flour:800/-\n(enter the item number to add to cart)\n");
                for(int i=1;i<=item;i++){
                    System.out.println("Enter your item "+i);
                    subitem=in.nextInt();
                    switch(subitem){
                        case 1:
                            total+=200;
                            break;
                        case 2:
                            total+=300;
                            break;
                        case 3:
                            total+=350;
                            break;
                        case 4:
                            total+=800;
                            break;
                        default:
                            System.out.println("No item listed for your entered value. 0 value added");
                    }
                }
                System.out.println("The total for your items is "+total);
                break;
            case 'c':
                System.out.print("Enter how many Clothes do you want to buy:");
                item=in.nextInt();
                System.out.print("1.Shirt:5000/-\n2.Pants:6000/-\n3.Traditional Wear:8000/-\n4.Trousers:4500/-\n(enter the item number to add to cart)\n");
                for(int i=1;i<=item;i++){
                    System.out.println("Enter your item "+i);
                    subitem=in.nextInt();
                    switch(subitem){
                        case 1:
                            total+=5000;
                            break;
                        case 2:
                            total+=6000;
                            break;
                        case 3:
                            total+=8000;
                            break;
                        case 4:
                            total+=4500;
                            break;
                        default:
                            System.out.println("No item listed for your entered value. 0 value added");
                    }
                }
                System.out.println("The total for your items is "+total);
                break;
            }
    }
    public static void question3(){
        int no,marks;
        
        System.out.println("Enter your marks:");
        marks=in.nextInt();
        no=marks/10;
        switch(no){
            case 10:
            case 9: System.out.println("A"); break;
            case 8: System.out.println("B"); break;
            case 7: System.out.println("C"); break;
            case 6: System.out.println("D"); break;
            default: System.out.println("F"); break;
        }
    }
    public static void question4(){
        int choice;
        System.out.println("1.Radius of a Circle\n2.Length and width of a rectangle"
                + "\n3.Base and Height of a Triangle\nEnter the number only:");
        choice=in.nextInt();
        switch(choice){
            case 1:
                System.out.println("Enter the Radius of a Circle:");
                double ans,r=in.nextDouble();
                ans=Math.pow(r,2)*Math.PI;
                System.out.println("The area is"+ans);
                break;
            case 2:
                System.out.println("Enter the Length and width of a rectangle:");
                double width,length=in.nextDouble();
                width=in.nextDouble();
                System.out.println("The area is"+(width*length));
                break;
            case 3:
                System.out.println("Enter the Base and Height of a Triangle");
                double height,base=in.nextDouble();
                height=in.nextDouble();
                System.out.println("The area is"+(0.5*height*base));
                break;
            default:
                System.out.println("Invalid number Please try again!");
        } 
    }
    public static void question5(){
         for(int i=10;i<=30;i++){
            System.out.println(i);
        }
    }
    public static void question6(){
        System.out.println("Enter a three digit number:");
        int i=1;
        do{
            System.out.println("2x"+i+"="+(2*i));
            i++;
        }while(i<=10);{
        System.out.println("Program Ccompleted");
        }
    }
    
    public static void question7(){
        for(int i=1;i<=10;i++){
            int j=1;
            while(j<=10){
                System.out.print("*");
                j++;
            }
            System.out.println("");
        }
    }
    
    public static void question8(){
        int j=1,k=1;
        for(int i=1;i<=10;i+=2){
            System.out.println("For Loop:"+i);
        }
        while(j<=10){
            System.out.println("While Loop:"+j);
            j+=2;
        }
        do{
            System.out.println("Do-While Loop:"+k);
            k+=2;
        }while(k<=10);{
        System.out.println("Program Complete!");
    }
    }
    
    public static void question9(){
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        question6();
        question2();
        in.close();
    }
    
}


