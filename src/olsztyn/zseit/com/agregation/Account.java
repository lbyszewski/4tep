package olsztyn.zseit.com.agregation;

public class Account {
    public Person owner;
    public double balance;

    public Account(Person owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
}
