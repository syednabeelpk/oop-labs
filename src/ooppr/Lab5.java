package ooppr;

import java.util.*;

public class Lab5 {

    static Scanner in = new Scanner(System.in);

    public static void Question1() {

        System.out.println("Enter a word");
        String word = in.next();
        System.out.println("Enter a character to find in that word:");
        char ch = in.next().charAt(0);

        for (int i = 0; i < word.length(); i++) {
            if (ch == word.charAt(i)) {
                System.out.println("The ch is found at index" + i);
                break;
            } else {
                System.out.println("Not found");
            }
        }
    }

    public static void question2() {
        int a = 0, b = 1;
        int count = 0;

        while (count < 10) {
            int next = a;

            if (next % 3 != 0) {
                System.out.print(next + " ");
                count++;
            }

            int temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void question3() {
        System.out.println("enter a word:");
        String word = in.next();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count += 1;
                    if (count == word.length() - 1) {
                        System.out.println("All characters are repeated");
                    }
                    continue;
                } else if (word.charAt(i) != word.charAt(j)) {
                    System.out.println("The non repeated character is " + word.charAt(j));
                    break;
                }
            }
            break;
        }
    }

    public static void question4() {
        Random rand = new Random();
        String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
        double[] values=new double[12];
        
        for(int i=0;i<months.length;i++){
            values[i]=rand.nextDouble(100);
        }
        double sum=0.0;
        for(int j=0;j<months.length;j++){
            System.out.println(months[j]+"="+values[j]);
            sum+=values[j];
        }
        double average=sum/months.length;
        System.out.println("\nThe average is "+average);
        
    }
    public static void question5(){
        System.out.println("Enter the how many values you want to enter:");
        int value=in.nextInt();
        int[] numbers=new int[value];
        double sum=0;
        for(int i=0;i<numbers.length;i++){
            System.out.println("Enter the value number"+(i+1));
            numbers[i]=in.nextInt();
            sum+=numbers[i];
        }
        double average=sum/numbers.length;
        System.out.println("The average is "+average);
        
    }
    public static void question6(){
        System.out.println("Enter how many values to enter:");
        int i=in.nextInt();
        
        int[] numbers=new int[i];
        
        for(int k=0;k<numbers.length;k++){
            System.out.println("Enter number "+(k+1));
            numbers[k]=in.nextInt();
        }
        
        for(int j=i-1;j>=0;j--){
            System.out.print(numbers[j]+" ");
        }
        
    }
    public static void question7(){
        int[] numbers = {5, 2, 9, 1, 7};
        String[] names = {"Zara", "Ali", "John", "Ahmed"};
        Arrays.sort(numbers);
        Arrays.sort(names);

        System.out.println("Sorted Numeric Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("Sorted String Array:");
        for (String name : names) {
            System.out.print(name + " ");
        }
    
    }

    public static void main(String args[]) {
        question7();
        in.close();
    }
}

