import java.util.Scanner;
public class sumandavgofarray {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum=0;
    double average;
    System.out.println("enter how many nums");
    int n = scanner.nextInt(); 
        int [] arr= new int[n];
          
       System.out.println("enter the nums");
   for(int i=0 ; i < arr.length ; i++){
    
    arr[i]=scanner.nextInt();
   }
   for(int j=0; j < arr.length ; j++){
      sum=arr[j]+sum;

   }
    average=(double)sum/arr.length;
   System.out.println("the sum of an array is "+sum);
   System.out.println("meanwhile the average is "+average);

    }
    
}