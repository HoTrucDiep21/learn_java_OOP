package account;

public class Account {
    String accountCode, accountName, CMNN, phoneNumber, balance;

    public Account() {
    }

    public String getAccountCode() {
        return accountCode;
    }

    public Account(String accountCode, String accountName, String CMNN, String phoneNumber, String balance) {
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.CMNN = CMNN;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getCMNN() {
        return CMNN;
    }

    public void setCMNN(String cMNN) {
        CMNN = cMNN;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBalance() {

        return balance;

    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

}
