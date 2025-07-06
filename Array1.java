import java.util.*;
public class Array1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] numbers={10,20,30,40,50};
        int sum=0;
        
        for(int num:numbers){
            sum+=num;
        }
        double average=(double) sum/numbers.length;
        System.out.println("Sum of array: "+sum);
        System.out.println("Average of the array: "+average);
        
        
    }
}