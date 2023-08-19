import java.util.UUID;

public class SBIAccount implements BankAccountInterface{
    private String password,userName,accNo;
    private double bal;
    private final double ROR = 5.6;
    private final String IFSC = "SBIN80609";

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "your available bal is : "+this.bal;
        }
        return "wrong password";
    }

    @Override
    public String addMoney(double amount) {
        this.bal += amount;
        return amount+"rs. is credited in your account";
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    @Override
    public String toString() {
        return "SBIAccount{" +
                "password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", accNo='" + accNo + '\'' +
                ", bal=" + bal +
                ", ROR=" + ROR +
                ", IFSC='" + IFSC + '\'' +
                '}';
    }

    public SBIAccount() {
    }

    public double getROR() {
        return ROR;
    }

    public SBIAccount(String userName, String password, double bal) {
        this.password = password;
        this.userName = userName;
        this.bal = bal;
        this.accNo = String.valueOf(UUID.randomUUID());
    }

    public String getIFSC() {
        return IFSC;
    }

    @Override
    public String withdraw(double amount, String password) {
        if(this.password.equals(password)){
            if(amount>this.bal){
                return "Insufficient Balance";
            }
            else {
                this.bal -= amount;
                return amount+"Rs is Debited from your account \n your available balance is "+this.bal;
            }
        }
        return "wrong password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassowrd) {
        if(this.password.equals(oldPassword)){
            this.password = newPassowrd;
            return "password changed sucessfully!!!!!!!!";
        }
        return "old password is incorrect";
    }

    @Override
    public double calculateInterest(int time) {
        return (this.bal*this.ROR*time)/100;
    }
}
