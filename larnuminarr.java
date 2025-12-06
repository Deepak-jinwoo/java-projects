import java.util.Scanner;
public class larnuminarr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.println("enter how many nums should be inputed");
        int n = scanner.nextInt();
       
        int []arr=new int[n];
      
       System.out.println("enter the nums");
       
        for(int i=0;i<arr.length;i++){
             
           arr[i]=scanner.nextInt();
        }
        int max = arr[0];
        for(int j=0;j<arr.length;j++){

        if(arr[j]>max){
            max=arr[j];
        }
    }
    System.out.println("greatest num is "+max);
} 

    }
    

