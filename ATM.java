/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
public static  class ATM {
    float balance=500;                             
    int pin_no=1234;
    Scanner s=new Scanner(System.in);
    public void menu(){
        System.out.println("**MENU**");
        System.out.println("1.Deposit Money");
        System.out.println("2.Withdraw Money");
        System.out.println("3.Check account balance");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");
        int m=s.nextInt();
        switch (m){
            case 1:
                deposit();
                break;
            case 2:
                withdraw();
                break;
            case 3:
                checkbalance();
                break;
            case 4:
                System.out.println("Thank you,please visit again!!");
                break;
            default:
                System.out.println("Enter valid choice");
        }
    }
    public void checkbalance() {
        System.out.println("Your account balance is: "+balance);
        menu();
    }
    public void deposit() {
        System.out.println("Enter the amount you want to deposit: ");
        float amount=s.nextFloat();
        balance=balance+amount;
        System.out.println("Money deposited successfully!!!");
        menu();
    }
    public void withdraw() {
        
        System.out.println("Enter the amount you want to withdraw: ");
        float a=s.nextFloat();
        if(a<balance) {
                System.out.println("Withdrawn Successfully!!!");
                balance=balance-a;
        }
        else {
            System.out.println("Insufficient balance!!");
        }
        menu();
    }
    public void Pin()
    {
        System.out.println("Enter the pin number: ");
        int pin=s.nextInt();
        if(pin==pin_no)
        {
            menu();
        }
        else System.out.println("Enter valid pin number!");
    }
}


    public static void main(String[] args) {
        ATM ob=new ATM();
        ob.Pin();
    }

}
