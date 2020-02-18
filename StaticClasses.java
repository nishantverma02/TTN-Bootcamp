class Outer{
    static String firstname;
    static String lastname;
    static int age;
    static {
        firstname="Prajjwal";
        lastname="Pandey";
        age=22;
           }
    static void statm(){
        System.out.println("first name is:"+firstname);
        System.out.println("last name  is:"+lastname);
        System.out.println("age is:"+age);
    }

}

public class StaticClasses {
    public static void main(String[] args) {
       Outer.statm();
    }
}
