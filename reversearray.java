import java.util.Scanner;
class reversearray{
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter how many nums sh");
    int n = scanner.nextInt();
    int []arr=new int[n]; 
     System.out.println("enter nums");  
    for(int i = 0 ; i < arr.length ; i++){
      arr[i]=scanner.nextInt();
    }
    System.out.println("enter number to search");
    int num=scanner.nextInt();
    for(int j=0;j<arr.length;j++){
      if (arr[j]==num) {
        System.out.println("the num found at index"+j);
        
      }   
    }
}
}