package olsztyn.zseit.com.agregation;

public class Bank {
    public static void main(String[] args) {
        Person jan = new Person("Jan","X","5435454545");
        Account account = new Account(jan,500000);
        System.out.println(account.owner.firstName + account.owner.lastName );
    }
}
