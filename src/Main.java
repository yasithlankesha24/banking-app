public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Alex", 15505);

        bankAccount.withdraw(570);
        bankAccount.deposit(10000);
        bankAccount.withdraw(5400);

        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getBalance());
    }
}
