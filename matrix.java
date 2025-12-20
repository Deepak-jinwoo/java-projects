import java.util.Scanner;

public class matrix {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("enter how many rows to be created");
    int row = scanner.nextInt();
    System.out.println("enter how many columns to be created");
    int column = scanner.nextInt();
    int [][] a = new int[row][column];
    int [][] b = new int[row][column];
    int [][] arr = new int[row][column];
    System.out.println("enter the elements a");
    for(int i = 0; i < row ; i++){
    for(int j = 0; j < column ; j++){
       a[i][j] = scanner.nextInt();
    }
}
System.out.println("enter the elements for b");
for(int i = 0; i < row ; i++){
    for(int j = 0; j < column ; j++){
       b[i][j] = scanner.nextInt();
    }
}
      
for(int i = 0; i < row ; i++){
    for(int j = 0; j < column ; j++){
arr[i][j] = a[i][j]+b[i][j];
    }
}
System.out.println("the added elements are");
for(int i = 0; i < row; i++){
    for(int j = 0; j < column ; j++){
System.out.println(arr[i][j]);
    }
}
}
     
}