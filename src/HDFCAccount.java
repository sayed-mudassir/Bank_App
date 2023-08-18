import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{

    private String userName;
    private String password;
    private String accNo;
    private double bal;
    final double rateOfIntrest = 7.5;
    final String IFSC = "HDFC1024";

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "your available balance is : "+this.bal;
        }
        return "wrong password";
    }

    @Override
    public String addMoney(double amount) {
        this.bal += amount;
        return "money added sucessfully \n now your available balance is : "+ this.bal;
    }

    public HDFCAccount() {
        this.accNo = String.valueOf(UUID.randomUUID());
    }

    @Override
    public String withdraw(double amount, String password) {
        if (this.password.equals(password)){
            if(this.bal < amount){
                return "Insufficient Balance";
            }
            this.bal -= amount;
            return "Amount deducted sucessfully \n now Your available balance is : " + this.bal;
        }
        return "Incorrect Password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassowrd) {
        if (this.password.equals(oldPassword)){
            this.password = newPassowrd;
            return "password changed sucessfully!!!!!!";
        }
        return "Incorrect old password";
    }

    @Override
    public double calculateInterest(int time) {

        return (this.bal*this.rateOfIntrest*time)/100.0;
    }

    public HDFCAccount(String userName, String password, double bal) {
        this.userName = userName;
        this.password = password;
        this.bal = bal;
        this.accNo = String.valueOf(UUID.randomUUID());
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public double getBal() {
        return bal;
    }

    public void setBal(double bal) {
        this.bal = bal;
    }

    public double getRateOfIntrest() {
        return rateOfIntrest;
    }

    public String getIFSC() {
        return IFSC;
    }

    @Override
    public String toString() {
        return "HDFCAccount{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", accNo='" + accNo + '\'' +
                ", bal=" + bal +
                ", rateOfIntrest=" + rateOfIntrest +
                ", IFSC='" + IFSC + '\'' +
                '}';
    }
}
