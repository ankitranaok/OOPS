//implementing method overriding and method overloading is polymorphism
class OverloadingDemo{
    void sum(int a , int b){
        System.out.println(a+b);
    }
    void sum(int a , int b , int c){
        System.out.println(a+b+c);
    }
    void sum(String a , int b){
        System.out.println(a+b);
    }
}


public class polymorphism {
    public static void main(String[] args) {
        OverloadingDemo obj = new OverloadingDemo();
        obj.sum("Ankit", 9);
        obj.sum(9, 9);
        obj.sum(5, 5, 8);
    }
}