public class BankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Integer accountNumber;
    private float balance; // automatically if zero

    public BankAccount(String firstName, String lastName, String dateOfBirth, Integer accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(float amount) {
        if (amount > 0.0f && this.balance - amount >= 0.0f) {
            this.balance -= amount;
        }
    }
}
