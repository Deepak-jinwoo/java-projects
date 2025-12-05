import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
         System.out.print("enter how many num should be inputed");
         int n = scanner.nextInt();
        int []arr=new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++){
        System.out.print("enter the nums");
          arr[i] =scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
         sum=arr[i]+sum;
        }
        System.out.println( (double)sum/5);

       
    }
}