
  class exist{
    void m(){
        System.out.println("hii");
    }
}
 public class ErrorGeneration {
    public static void main(String args[]) {
        try
        {
            Class.forName("ClassDoesnotExist");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
       exist obj=new exist();
    }

}
