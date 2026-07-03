package Day_11.Class_Task;

public class BankingTest {
    public static void main(String [] args){
        BankAccount b1 = new BankAccount();
        b1.deposit(1000);
        b1.withdraw(1000);
        System.out.println(b1.checkBalance());
        //System.out.println(b1.balance = 10000); //Error
        //b1.accName = "Shree"; //Error
        //System.out.println(b1.accName = "Shree"); //Error
        b1.setName("Shree");
        //b1.accName="Shree"; //Error
        System.out.println(b1.getName());
    }
}
class BankAccount{
    private String accName;
    int accNo;
    private float balance;
    //Methods
    public void deposit(float amount){
        balance = balance + amount;
        System.out.println(accName + "Amount Deposited " + amount + " Rs, " + "balance " + balance);
    }
    //Withdraw
    public void withdraw(float amount){
        balance = balance - amount;
        System.out.println("Amount Withdrawed " + amount + " Rs, " + "balance " + balance);

    }
    public float checkBalance(){
        return balance;
    }
    public void setName(String name){
        accName = name;
    }
    public String getName(){
        return accName;
    }
}
//Public
//Private      ****Access Modifier
//Default
//Protected
