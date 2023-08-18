// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        HDFCAccount demo = new HDFCAccount("demo","demo1234",50000);
//        demo.setUserName("dem0o");
//        demo.setPassword("demo1234");
//        demo.setBal(50000);
//        setter functions is not be needed for ther paramaterized constructor
        System.out.println(demo);
//        fetch balance
        System.out.println(demo.fetchBalance("demo123"));// wronng password
        System.out.println(demo.fetchBalance("demo1234"));// correct passowrd
//        withdrawl
        System.out.println(demo.withdraw(60000,"demo1234")); // withdrawing amount more than available balance
        System.out.println(demo.withdraw(6000,"demo1234")); // amount is less than available balance
        System.out.println(demo.withdraw(6000,"demo12345")); // password is wrong
//        calculate rate of intrest
        System.out.println(demo.calculateInterest(5));
//        changing password
        System.out.println(demo.changePassword("deomo212","demo"));// i am checking that my wrong password message is appearing or not
        System.out.println(demo.changePassword("demo1234","demo"));
//        adding money
        System.out.println(demo.addMoney(6000));
    }
}