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
        int[][] ar=new int[3][3];
        
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.printf("Enter the number for position %dx%d:",i+1,j+1);
                ar[i][j]=in.nextInt();
            }
        }
        
        boolean symmetric=true;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                if(ar[i][j]!=ar[j][i]){
                    symmetric = false;
                    break;
                }
            }
            if(!symmetric){break;}
        }
        if (symmetric==false){
            System.out.println("It is not symmetric");
        }else{
            System.out.println("It is symmetric");
        }
    }
    public static void Question4(){
        System.out.println("Enter the no of rows:");
        int r=in.nextInt();
        System.out.println("Enter the no of columns:");
        int c=in.nextInt();
        int[][] ar=new int[r][c];
        int[] sumar=new int[r];
        
        for(int i=0;i<ar.length;i++){
            int sum=0;
            for(int j=0;j<ar[i].length;j++){
                System.out.printf("Enter the number for position %dx%d:",i+1,j+1);
                ar[i][j]=in.nextInt();
                sum+=ar[i][j];
            }
            sumar[i]=sum;
        }
        for(int i=0;i<sumar.length;i++){
            System.out.println("The sum of row "+(i+1)+" is "+sumar[i]);
        }
        
    }
    
    
    
    public static void Question5(){ //Did with Gemini
    int rows = 5;
    for (int i=1;i<=rows;i++){
        for(int j=1;j<=rows-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++){
            System.out.print("*");
        }

        System.out.println();
    }
}
    
    public static void main(String[] args) {
        Question5();
    }
}
