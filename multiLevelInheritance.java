class A{
    void methodA(){
        System.out.println("Method of A class");
    }
}


class B extends A{
    void MethodB(){
        System.out.println("Method of B class");
    }
}


class C extends B{
    void MethodC(){
        System.out.println("Method of C class");
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.MethodC();
        obj.MethodB();
        obj.methodA();
    }
}
