//find the index of element in a given array.

import java.util.*;

public class Linear_Search{

   public static void main(String args[]){
    int num[]= {2,3,4,5,6,7,8,9,10,12,14};
    int key = 10;

     for(int i = 0;i<num.length;i++){
        if(num[i]==key){
            System.out.println("Key index:-" +i);
             break;
        } 
        System.out.println("key is not found");  
     }
     
   }
}
