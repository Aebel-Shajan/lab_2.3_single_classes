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
        // ACT
        String actual = bankAccount.getFirstName();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetFirstName() {
        // ARRANGE
        String expected = "Joe";
        // ACT
        bankAccount.setFirstName("Joe");
        String actual = bankAccount.getFirstName();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    // Last Name
    @Test
    public void canGetLastName() {
        // ARRANGE
        String expected = "Shajan";
        // ACT
        String actual = bankAccount.getLastName();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetLastName() {
        // ARRANGE
        String expected = "Biden";
        // ACT
        bankAccount.setLastName("Biden");
        String actual = bankAccount.getLastName();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    // Account Number
    @Test
    public void canGetAccountNumber() {
        // ARRANGE
        int expected = 123456;
        // ACT
        int actual = bankAccount.getAccountNumber();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetAccountNumber() {
        // ARRANGE
        int expected = 654321;
        // ACT
        bankAccount.setAccountNumber(654321);
        int actual = bankAccount.getAccountNumber();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    // Date of birth
    @Test
    public void canGetDateOfBirth() {
        // ARRANGE
        String expected = "05/07/2001";
        // ACT
        String actual = bankAccount.getDateOfBirth();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetDateOfBirth() {
        // ARRANGE
        String expected = "01/01/1900";
        // ACT
        bankAccount.setDateOfBirth("01/01/1900");
        String actual = bankAccount.getDateOfBirth();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    // Balance
    @Test
    public void canGetBalance() {
        // ARRANGE
        float expected = 100.00f;
        // ACT
        float actual = bankAccount.getBalance();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canSetBalance() {
        // ARRANGE
        float expected = 200.00f;
        // ACT
        bankAccount.setBalance(200.00f);
        float actual = bankAccount.getBalance();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canDeposit() {
        // ARRANGE
        bankAccount.setBalance(100.00f);
        float expected = 500.00f;
        // ACT
        bankAccount.deposit(400.00f);
        float actual = bankAccount.getBalance();
        // ASSERT
        assertThat(actual).isEqualTo(expected);
    }

}
