package Lab2;
import java.util.*;
public class QuestionsLab1 {

    public static void lab(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double marks,per,sub1,sub2,sub3,sub4,sub5;
        char grade;
        System.out.println("Enter the marks of subject 1:");
        sub1=in.nextDouble();
        System.out.println("Enter the marks of subject 2:");
        sub2=in.nextDouble();
        System.out.println("Enter the marks of subject 3:");
        sub3=in.nextDouble();
        System.out.println("Enter the marks of subject 4:");
        sub4=in.nextDouble();
        System.out.println("Enter the marks of subject 5:");
        sub5=in.nextDouble();
        
        
        marks=sub1+sub2+sub3+sub4+sub5;
        per=marks/500*100;        
        if (marks>=90) {
            grade='A';
        } else if(marks>=80 && marks<90) {
            grade='B';
        } else if(marks>=70 && marks<80){
            grade='C';
        } else if(marks>=60 && marks<70){
            grade='D';
        } else if(marks>=50 && marks<60){
            grade='E';
        }else{
            grade='F';
        }
        System.out.println("The total is:"+marks);
        System.out.println("The percentage is:"+per);
        System.out.println("The grade is:"+grade);
        
        in.close();
    }
}
