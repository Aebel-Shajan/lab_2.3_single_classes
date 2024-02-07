import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    BankAccount bankAccount;
    @BeforeEach
    public void setup() {
        this.bankAccount = new BankAccount();
        bankAccount.setFirstName("Aebel");
        bankAccount.setLastName("Shajan");
        bankAccount.setAccountNumber(123456);
        bankAccount.setDateOfBirth("05/07/2001");
        bankAccount.setBalance(100.00f);
    }




}
