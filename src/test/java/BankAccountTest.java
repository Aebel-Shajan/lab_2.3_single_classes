import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;
    @BeforeEach
    public void setup() {
        this.bankAccount = new BankAccount();

        // Assumes setters work ;-; oops
        bankAccount.setFirstName("Aebel");
        bankAccount.setLastName("Shajan");
        bankAccount.setAccountNumber(123456);
        bankAccount.setDateOfBirth("05/07/2001");
        bankAccount.setBalance(100.00f);
    }

    // First Name
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

    // Last Name
    @Test
    public void canGetLastName() {
        // ARRANGE
        String expected = "Shajan";
        // ASSERT
        String actual = bankAccount.getLastName();
        // ACT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetLastName() {
        // ARRANGE
        String expected = "Biden";
        // ASSERT
        bankAccount.setLastName("Biden");
        String actual = bankAccount.getLastName();
        // ACT
        assertThat(actual).isEqualTo(expected);
    }

    // Account Number
    @Test
    public void canGetAccountNumber() {
        // ARRANGE
        int expected = 123456;
        // ASSERT
        int actual = bankAccount.getAccountNumber();
        // ACT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetAccountNumber() {
        // ARRANGE
        int expected = 654321;
        // ASSERT
        bankAccount.setAccountNumber(654321);
        int actual = bankAccount.getAccountNumber();
        // ACT
        assertThat(actual).isEqualTo(expected);
    }

    // Date of birth
    @Test
    public void canGetDateOfBirth() {
        // ARRANGE
        String expected = "05/07/2001";
        // ASSERT
        String actual = bankAccount.getDateOfBirth();
        // ACT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth() {
        // ARRANGE
        String expected = "01/01/1900";
        // ASSERT
        bankAccount.setDateOfBirth("01/01/1900");
        String actual = bankAccount.getDateOfBirth();
        // ACT
        assertThat(actual).isEqualTo(expected);
    }

    // Balance
    @Test
    public void canGetBalance() {
        // ARRANGE
        float expected = 100.00f;
        // ASSERT
        float actual = bankAccount.getBalance();
        // ACT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetBalance() {
        // ARRANGE
        float expected = 200.00f;
        // ASSERT
        bankAccount.setBalance(200.00f);
        float actual = bankAccount.getBalance();
        // ACT
        assertThat(actual).isEqualTo(expected);
    }


}
