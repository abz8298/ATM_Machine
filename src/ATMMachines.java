import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 5472;

    public void checkpin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN){
            menu();
        }
        else {
            System.out.println("Enter a valid pin");
            menu();
        }
    }
    public void menu(){
        System.out.println("Enter Your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdrawl Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt ==1){
            checkBalance();
        } else if (opt == 2) {
            withdrawlMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        }
        else {
            System.out.println("Enter a valid Choice");
        }

    }
    public void checkBalance(){
        System.out.println("Balance "+Balance);
        menu();
    }
    public void withdrawlMoney(){
        System.out.println("Enter Amount to Withdrawl");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if (amount>Balance){
            System.out.println("Insufficient Balance");
        }else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawl Successfully");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class ATMMachines {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();

    }
}
