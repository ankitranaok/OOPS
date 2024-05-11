import java.util.*;
    class ATM{
        float balance;
        int PIN=1234;

        public void checkPin(){
                System.out.println("Enter your pin :");
                Scanner sc = new Scanner(System.in);
                int enter_pin = sc.nextInt();
                if(enter_pin==PIN){
                    menu();
                }
                else{
                    System.out.println("Enter a valid pin");
                    menu();
            }
        }

    
        
        public void menu(){
            System.out.println("Enter you choice");
            System.out.println("1. Check A/C balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit money");
            System.out.println("4. Exit");

            Scanner sc = new Scanner(System.in);
            int opt=sc.nextInt();

            if(opt==1){
                checkBalance();
            }
            else if(opt==2){
                withdrawMoney();
            }
            else if(opt==3){
                depositMoney();
            }
            else if(opt==4){
                return;
            }
            else{
                System.out.println("Enter a valid number");
            }
        }



        public void checkBalance(){
            System.out.println("Balance :" + balance);
            menu();
        }

        public void withdrawMoney(){
            System.out.println("Enter money to withdraw:");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            if(amount>balance){
                System.out.println("Insufficient balance");
            }
            else{
                balance = balance - amount;
                System.out.println("Money withdraw sucessfull");
            }
            menu();
        } 


        public void depositMoney(){
            System.out.println("Enter the amount");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            balance=balance+amount;
            System.out.println("Money Deposited sucessfully");
            menu();
        }


    }
    public class atmMachine{ 
    public static void main(String [] args){
        ATM obj = new ATM();
        obj.checkPin();
    }
}