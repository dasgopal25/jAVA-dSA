//creating an array
import java.util.*;

public class class_1{

   public static void main(String args[]){
//         int marks[]= new int[50];

//         int numbers[]={1,2,3,4,5};

//         int moreNumbers[] = {6,8,10};

//         String fruits[] = {"apple", "mango","orange"};

//         System.out.println(moreNumbers[1]);

        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number:-");
        marks[0] = sc.nextInt();
        System.out.print("Enter 2nd number:-");
        marks[1] = sc.nextInt();
        System.out.print("Enter 3rd number:-");
        marks[2] = sc.nextInt();
        
        for(int i = 0; i<=2;i++){
          System.out.println(marks[i]);
        }
    }

 }
