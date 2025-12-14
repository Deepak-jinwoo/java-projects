public class methodoverloading {
    public static void main(String[] args) {
    Mathutils m = new Mathutils();
        m.max(5, 4);
        m.max(9.8,6.7);
    }
}
class Mathutils{
    void max(int a ,int b){
        if(a>b){
 System.out.println("the greatest of two integers are " +a );
    }
    else
    System.out.println("the greatest of twointegers are "+b);
}
void max(double a ,double b){
        if(a>b){
 System.out.println("the greatest of two integers are " +a );
    }
    else
    System.out.println("the greatest of twointegers are "+b);
}
}