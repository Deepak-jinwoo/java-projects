class vehicle{
    String fueltype(){
        return "petrol";
    }
}
class car extends vehicle{
    String fueltype(){
        return "petrol";
    }
}
class truck extends vehicle{
    String fueltype(){
       return "diesel";
    }
}
class bike extends vehicle{
    String fueltype(){
        return "petrol";
        
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        vehicle v = new truck();
        car c = new car();
        bike b = new bike();
        System.out.println(c.fueltype());
        System.out.println(v.fueltype());
        System.out.println(b.fueltype());
    }
    
}
