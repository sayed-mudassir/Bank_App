// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("choose your bank press A for HDFC and B for SBI");
        Scanner sc = new Scanner(System.in);

//      HDFC Account
        HDFCAccount hdfc = new HDFCAccount("hdfc","hdfc1234",2020.02);
        System.out.println(hdfc);
        System.out.println(hdfc.fetchBalance("hdfc123"));// wrong password
        System.out.println(hdfc.fetchBalance("hdfc1234"));//correct password
        System.out.println(hdfc.addMoney(5050));
        System.out.println(hdfc.withdraw(2020.020,"hdfc123"));//wrong password
        System.out.println( hdfc.withdraw(2020.020,"hdfc1234"));//correct password
        System.out.println(hdfc.changePassword("hdfc234","hdfc00"));//wrong password
        System.out.println(hdfc.changePassword("hdfc1234","hdfc00"));//correct password
//        SBI account
//        else if (choice.equals("b")) {

            SBIAccount sbi = new SBIAccount("sbi","sbi123",2020.20);
        System.out.println(sbi);
            System.out.println(sbi.fetchBalance("sb123"));// wrong password
            System.out.println(sbi.fetchBalance("sbi123"));//correct password
            System.out.println(sbi.addMoney(5050));
            System.out.println(sbi.withdraw(2020.020,"sb123"));//wrong password
            System.out.println( sbi.withdraw(2020.020,"sbi123"));//correct password
            System.out.println(sbi.changePassword("hdfc234","hdfc00"));//wrong password
            System.out.println(sbi.changePassword("sbi123","sbi00"));//correct password


//

    }
}