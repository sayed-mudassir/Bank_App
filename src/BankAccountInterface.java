public interface BankAccountInterface {
    String fetchBalance(String password);
    String addMoney(double amount);
    String withdraw(double amount , String password);
    String changePassword(String oldPassword, String newPassowrd);
    double calculateInterest(int time);

}
