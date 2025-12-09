import java.util.Scanner;

public class addoddeven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the arr size");
        int n = scanner.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int odd=0;
        int even=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]%2==0){
                even=even+arr[j];
        }
        else{
            odd=odd+arr[j];
        }
        
    
}
   System.out.println("the odd numbers are"+even);
        System.out.println("the even numbers are"+odd);
}
}
