public class CountCharWithoutLoop {
    public static void main(String[] args)
    {
        String str = "prajjwal";
        int count = str.length() - str.replace("a", "").length();
        System.out.println("Number of occurances of 'a' in "+str+" = "+count);
    }
}
