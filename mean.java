import java.util.Scanner;
public class mean {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the spaces of nums for first array");
        int n1 = scanner.nextInt();
        int sum1=0;
        int[]arr1=new int[n1];
        for(int i=0 ; i<arr1.length ; i++){
            arr1[i]=scanner.nextInt();
            sum1+=arr1[i];            
        }
         System.out.println("enter the spaces of nums for second array");
         int n2 = scanner.nextInt();
        int sum2=0;
        int[]arr2=new int[n2];
        for(int j=0 ; j<arr2.length ; j++){
            arr2[j]=scanner.nextInt();
            sum2+=arr2[j];                   
    }
    System.out.println("the combined arrays btw"+sum1+sum2);
    int div = arr1.length+arr2.length;
    double mean=(double)(sum1+sum2)/div;
    System.out.println(mean);
}
}
