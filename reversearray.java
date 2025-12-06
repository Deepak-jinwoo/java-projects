import java.util.Scanner;
public class reversearray{
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter how many nums sh");
    int n = scanner.nextInt();
    int []arr=new int[n];
    System.out.println("enter nums");
    for(int i = 0 ; i < arr.length ; i++){
       
      arr[i]=scanner.nextInt();
    }
    for(int j=n-1 ; j>=40 ; j--){
       System.out.println(arr[j]);
    }
}
}