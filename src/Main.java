public class Main {
    public static void main(String[] args) {
        //alex bank account
        BankAccount bankAccount = new BankAccount("Alex", 15505);

        bankAccount.withdraw(570);
        bankAccount.deposit(10000);
        bankAccount.withdraw(5400);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());
        
        //david bank account
        BankAccount bankAccount2 = new BankAccount("Alex", 700);

        bankAccount2.withdraw(280);
        bankAccount2.deposit(1500);
        bankAccount2.withdraw(1000);

        System.out.println(bankAccount2.getOwner());
        System.out.println(bankAccount2.getBalance());
    }
}
