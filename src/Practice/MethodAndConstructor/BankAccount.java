package Practice.MethodAndConstructor;

public class BankAccount {
    int accountNumber;
    int balance;
    int amt;
    int result;

    public int deposit(int amt) {
        result = balance+amt;
        return result;

    }

   public int withdraw(int amt) {
        result = balance - amt;
        return result;

    }

    public int checkBalance() {
        result= balance;
    return balance;
    }

   BankAccount() {
       accountNumber = 123456789;
       balance = 1000;
   }
    void display()
    {
        System.out.println(result);
    }

    public static void main(String[]args)
    {
        BankAccount bankAccount = new BankAccount();
        bankAccount.checkBalance();
        bankAccount.display();
        bankAccount.deposit(500);
        bankAccount.display();
        bankAccount.withdraw(300);
        bankAccount.display();
        bankAccount.checkBalance();
        bankAccount.display();



    }
}
