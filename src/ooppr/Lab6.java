package ooppr;
import java.util.*;
public class Lab6 {
    static Scanner in=new Scanner(System.in);
    public static void Question1(){
        int[][] ar=new int[13][13];
        
        for(int i=0;i<ar.length;i++){
            System.out.print("Column"+i+"\t");
        }
        System.out.println("");
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                System.out.print(i+"x"+j+"="+(i*j)+"\t");
            }
            System.out.println("");
        }
    }
    public static void Question2(){
        int[][] ar=new int[2][3];
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.printf("Enter the number for position %dx%d:",i,j);
                ar[i][j]=in.nextInt();
            }
        }
        System.out.println("Before Transpose Matrix:");
        for(int i=0;i<ar.length;i++){ 
            System.out.print("[");
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");       
            }
            System.out.println("]");
        }
        System.out.println("After Transpose Matrix:");
        for(int j=0;j<3;j++){
            System.out.print("[");
            for(int i=0;i<2;i++){
                System.out.print(ar[i][j]+" ");       
            }
            System.out.println("]");
        }
    }
    public static void Question3(){
        
    }
    public static void Question4(){
        
    }
    public static void Question5(){
        
    }
    
    public static void main(String[] args) {
        Question2();
    }
}
