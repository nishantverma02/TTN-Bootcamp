interface Bank{
    void getDetails();
}
 class SBI implements Bank {
     @Override
     public void getDetails() {
         System.out.println("details of SBI");
         System.out.println("rate of interest on normal deposit=7.2%");
         System.out.println("types of Loan:-educationloan,homeloan,carloan");
         System.out.println("minimum balance=3000");
     }
 }
     class BOI implements Bank{
         public void getDetails() {
             System.out.println("details of BOI");
             System.out.println("rate of interest on normal deposit=9.2%");
             System.out.println("types of Loan:-educationloan,homeloan,carloan");
             System.out.println("minimum balance=2000");
         }


 }
 class ICIC implements Bank{
     public void getDetails() {
         System.out.println("details of ICIC");
         System.out.println("rate of interest on normal deposit=9.2%");
         System.out.println("types of Loan:-educationloan,homeloan,carloan");
         System.out.println("minimum balance=2000");
     }
 }
public class BankDetails {
    public static void main(String[] args) {

        Bank ba=new ICIC();
        ba.getDetails();
        Bank ca=new BOI();
        ca.getDetails();
        Bank sbi=new SBI();
        sbi.getDetails();
    }

}
