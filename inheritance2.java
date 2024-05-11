class vehicle{
    double price;
    double mileage;
    String color;

    void display(){
        System.out.println("Price: "+price);
        System.out.println("mileage: "+mileage);
        System.out.println("color: "+color);
    }
}

class car extends vehicle{
    String ftype;
    boolean sunroof;
    String brand;
}

public class inheritance2 {
    public static void main(String[] args) {
        car car1 = new car();
        car1.brand = "Audi";
        car1.price = 100000;
        car1.ftype = "Diesel";
        car1.color = "Green";
        car1.sunroof = true;
        car1.mileage = 88;
        car1.display();
        System.out.println(car1.sunroof);
    }
}
