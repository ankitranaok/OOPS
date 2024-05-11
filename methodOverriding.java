class Bank{
    public void RateofInterest(){
        System.out.println("Generally Rate of interest is 8%");
    }
}

class SBI extends Bank{
    public void RateofInterest(){
        System.out.println("Generally Rate of interest is 10%");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        SBI obj =new SBI();
        obj.RateofInterest();
    }    
}