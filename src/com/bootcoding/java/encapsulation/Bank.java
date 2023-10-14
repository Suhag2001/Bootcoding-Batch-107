package src.com.bootcoding.java.encapsulation;

public class Bank {
    public static void main(String[] args) {
        BankDetails details = new BankDetails();
        details.setUserName("Ram Singh");
        details.setAccountNumber(585666664);
        details.setEmail("ram@gmail.com");
        details.setBankBalance(655555.32);

        System.out.println("user Name: " + details.getUserName() + " Email: " + details.getEmail() + " Bank account : " + details.getAccountNumber() + "Back Balance" + details.getBankBalance()) ;
    }
}
