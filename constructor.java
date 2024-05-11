import java.util.*;
class students{
    int id;
    int age;


    students(int id , int age){
        this.id=id;
        this.age=age;
        System.out.println("Parameterized Constructor");
    }

    students(){
        System.out.println("Default constructor");
    }
}

public class constructor {
    public static void main(String[] args) {
      students obj = new students(9,20);
      students obj1 = new students();
    }
}