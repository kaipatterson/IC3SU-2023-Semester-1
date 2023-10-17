package lesson1;

public class Bank {
    public static void main(String[] args) {
    BankAccount account1 = new BankAccount("Maya", 1500, 585866);
    BankAccount account2 = new BankAccount("Toons", 100, 348285);
    
    account1.deposit(1000.01);
    account2.deposit(2.50);
    }
}
