package Day_13.Class_Task;

public class ExceptionalHandlingMethods {
        public static void main(String [] args){
            bankAccount b1 = new bankAccount();
            try {
                b1.deposit(-1);
            }catch(ArithmeticException e){
//            }catch(InvalidAmountException e){
                System.out.println(e);
            }
//            b1.withdraw(1000);
//            System.out.println(b1.checkBalance());
            //System.out.println(b1.balance = 10000); //Error
            //b1.accName = "Shree"; //Error
            //System.out.println(b1.accName = "Shree"); //Error
//            b1.setName("Shree");
//            //b1.accName="Shree"; //Error
//            System.out.println(b1.getName());
        }
    }
    class bankAccount {
        private String accName;
        int accNo;
        private float balance;

        //Methods
        public void deposit(int amount) throws ArithmeticException {
//            public void deposit(int amount) throws InvalidAmountException {

//            if(amount<0){
//                throw new ArithmeticException();
//            }

            if(amount<0){
                throw new ArithmeticException();
//                throw new InvalidAmountException();
            }
            balance = balance + amount;
            System.out.println(accName + "Amount Deposited " + amount + " Rs, " + "balance " + balance);
        }
        class InvalidAmountException extends Exception{
            InvalidAmountException() {
                super();
            }
        }
        class LowBalanceException extends Exception{
            LowBalanceException(){
                super();
            }
        }
        //Withdraw
        public void withdraw(float amount) {
            balance = balance - amount;
            System.out.println("Amount Withdrawed " + amount + " Rs, " + "balance " + balance);

        }

        public float checkBalance() {
            return balance;
        }

        public void setName(String name) {
            accName = name;
        }

        public String getName() {
            return accName;
        }
    }
//Public
//Private      ****Access Modifier
//Default
//Protected
