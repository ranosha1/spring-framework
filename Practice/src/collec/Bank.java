package collec;

public class Bank {

    String bank;
    int account;

    public Bank(String bank, int account){
        this.bank=bank;
        this.account=account;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bank='" + bank + '\'' +
                ", account=" + account +
                '}';
    }
}
