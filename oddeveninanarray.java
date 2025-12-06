import java.util.Scanner;
public class oddeveninanarray {
    public static void main(String[] args) {
         int even = 0;
          int odd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter how many nums");
         int n = scanner.nextInt();
        int[]arr=new int[n];
       System.out.println("enter the nums");
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt(); 
        }
        for(int j=0;j<arr.length;j++){
        if (arr[j]%2==0) {
            System.out.println("the even nums are "+arr[j]);
            even++;
        }
        else{
            System.out.println("the odd nums are "+arr[j]);
            odd++;
        }
        
    }
     System.out.println("the num of even nums are "+even+"the num of odd nums are "+odd);
     for(int j=0;j<arr.length;j++){
        System.out.println("meanwhile the totalnums"+arr[j]);
}
}
}
