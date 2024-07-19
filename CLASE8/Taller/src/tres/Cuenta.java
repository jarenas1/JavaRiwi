package tres;

public class Cuenta extends Dueño  {

    String numbOfAccount;
    double balance;

    public Cuenta(String cc, String name, String type, String numbOfAccount, double balance) {
        super(cc, name, type);
        this.numbOfAccount = numbOfAccount;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getNumbOfAccount() {
        return numbOfAccount;
    }

    public void setNumbOfAccount(String numbOfAccount) {
        this.numbOfAccount = numbOfAccount;
    }

    public void retirar (double cantidad){
        if (this.balance-cantidad < 0){
            System.out.println("Pobreton, no le alcanza");
            System.out.println("Saldo actual: "+ this.balance);
        }else{
            System.out.println("Retiro exitoso");
            this.balance -= cantidad;
            System.out.println("Saldo actual: "+ this.balance);
        }

        }

        public void  meter (double cantidad){
            System.out.println("Ingreso exitoso");
            this.balance += cantidad;
            System.out.println("Saldo actual: "+ this.balance);
        }
}

