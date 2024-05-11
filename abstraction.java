abstract class car{
    abstract public void fueltype();
    // public void color(){
    //     System.out.println("Green Color");
    // }
}

class tata extends car{
    public void fueltype(){
        System.out.println("Diesel");
    }
}

public class abstraction {
    public static void main(String[] args) {
        tata nexon = new tata();
        nexon.fueltype();
        //nexon.color(); 
    }
}