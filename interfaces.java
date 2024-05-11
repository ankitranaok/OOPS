interface car{
    public void start();
}

class electricCar implements car{
    public void start(){
        System.out.println("Electric car starts");
    }
}

class dieselCar implements car{
    public void start(){
        System.out.println("Diesel car starts");
    }
}

public class interfaces {
    public static void main(String[] args) {
        electricCar  Tesla = new electricCar();
        dieselCar XUV700 = new dieselCar();
        Tesla.start();
        XUV700.start();
    }
}
