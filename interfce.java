public class interfce {

    public static void main(String[] args) {
        circle c = new circle();
        rectangle r = new rectangle();
        c.formula(4.5);
        r.formula(4,9);
    }
}
interface shape{
    public void formula();   
    }
    class circle implements shape{
     public void formula(double r){
        System.out.println(3.14*r*r);
     }
    }
    class rectangle implements shape{
        public void formula(int l, int b){
            System.out.println(l*b);
        }
    }
 
    
 