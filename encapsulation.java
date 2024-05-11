class student{ 
   private String name;
   private int age;
   private int roll_no;


   public String get_name(){
    return name;
   }

   public int get_age(){
    return age;
   }
   
   public int get_roll_no(){
    return roll_no;
   }


   public void set_name(String name){
    this.name = name;
   }

   public void set_Age(int age){
    this.age=age;
    }

    public void set_roll_no(int roll_no){
    this.roll_no=roll_no;
    }
}


public class encapsulation {
    public static void main(String[] args) {
        student obj = new student();
        obj.set_name("Ankit");
        obj.set_roll_no(5006);
        obj.set_Age(20);
        System.out.println(obj.get_name());
        System.out.println(obj.get_age());
        System.out.println(obj.get_roll_no());
        }    
}