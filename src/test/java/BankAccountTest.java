import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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

    @Test
    public void canGetFirstName() {
        // ARRANGE
        String expected = "Aebel";
        // ASSERT
        String actual = bankAccount.getFirstName();
        // ACT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName() {
        // ARRANGE
        String expected = "Joe";
        // ASSERT
        bankAccount.setFirstName("Joe");
        String actual = bankAccount.getFirstName();
        // ACT
        assertThat(actual).isEqualTo(expected);
    }
    
}
