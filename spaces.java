import java.util.Scanner;

public class spaces{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter how many elements should be inserted in an array");
       int num = scanner.nextInt();
       System.out.println();
       int[] arr = new int[num];
      System.out.println("enter the elements in an array");
       for(int i = 0 ; i<arr.length ; i++){
        arr[i]=scanner.nextInt();
       }
       System.out.println("enter the target");
       int target = scanner.nextInt();
       int count=0;
       for(int j=0 ; j<arr.length ; j++){
        if (arr[j]==target) {
            count ++;
            
        }
       }
       System.out.println("this no occurs this times "+count);
    }
}
