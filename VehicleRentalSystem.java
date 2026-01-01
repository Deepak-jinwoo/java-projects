interface Rentable {
    void calculateRent(int hours);
}

class Car implements Rentable {
    
    public void calculateRent(int hours) {
        int rent = hours * 200;
        System.out.println("Vehicle : Car");
        System.out.println("Hours   : " + hours);
        System.out.println("Rent    : Rs." + rent);
    }
}

class Bike implements Rentable {
    public void calculateRent(int hours) {
        int rent = hours * 100;
        System.out.println("Vehicle : Bike");
        System.out.println("Hours   : " + hours);
        System.out.println("Rent    : Rs." + rent);
    }
}
class Bus implements Rentable {
    public void calculateRent(int hours) {
        int rent = hours * 500;
        System.out.println("Vehicle : Bus");
        System.out.println("Hours   : " + hours);
        System.out.println("Rent    : Rs." + rent);
    }
}


public class VehicleRentalSystem {
    public static void main(String[] args) {

        Rentable r ;

        r = new Car();
        r.calculateRent(5);
        System.out.println("--------------------");

        r = new Bike();
        r.calculateRent(3);
        System.out.println("--------------------");

        r = new Bus();
        r.calculateRent(2);
    }
}
