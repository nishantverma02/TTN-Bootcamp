public class ReverseDeleteString {
    public static void main(String[] args) {
         String s="vinodprajjwal";
        StringBuffer sb=new StringBuffer(s);
        //here we convert buffer into string


        //here we reverse the  String
        System.out.println(sb.reverse().delete(4,9));



    }
}
