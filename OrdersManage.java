

 class Customer
{
    private String name;
    private double phone;
    private int tokeno;
    Customer(String name,double phone)
    {
        this.name=name;
        this.phone=phone;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public int getTokeno() {
        return tokeno;
    }

    public void setTokeno(int tokeno) {
        this.tokeno = tokeno;
    }
    public void PlaceOrder()
    {

        //we will place order on the basis of name and phone number
    }
    public void checkOrderStatus(int tokeno)
    {

        // we will checkorderstatus on the basis of tokenno given to the customer

    }
    public void collectOrder(int tokeno)
    {
        // customer can collect the coffee after entering tokenno
    }
    public void payment()
    {
        //payment done through this function
    }



}
 class Bistro
{
    public void getOrderFromPendingQueue()
    {

    }
    public void prepareOrder()
    {

    }
    public void inserOrderIntoCompletedOrderQueue()
    {

    }
}



 class Cashier
{
    String nameOfCashier;
    int CashierId;


    public String getNameOfCashier() {
        return nameOfCashier;
    }

    public void setNameOfCashier(String nameOfCashier) {
        this.nameOfCashier = nameOfCashier;
    }

    public int getCashierId() {
        return CashierId;
    }

    public void setCashierId(int cashierId) {
        CashierId = cashierId;
    }

    public void takeOrder(String customerName)
    {
        //cashier will take the order
    }
    public void giveTokenNo(String customerName)
    {
        //this will be called when customer places an order so cashier will provide him with a tokenno
    }
    public void receivePayment(int tokenno)
    {
        //
    }
    public void addItToPendingQueue(int tokeno)
    {

    }



}

public class OrdersManage {
    public static void main(String[] args)
    {


    }
}
