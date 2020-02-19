
class CopyContructer{

    int rollno;
    String name;
    CopyContructer(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    CopyContructer(CopyContructer obj)
    {
        System.out.println("Copy Constructor Invoked");
        rollno = obj.rollno;
        name= obj.name;
    }

}

public class CloneStudents implements Cloneable {
    int rollno;
    String name;

    CloneStudents(int rollno, String name){
        this.rollno=rollno;
        this.name=name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String args[]){
        try{

            System.out.println("This is by cloning obbject method");
            CloneStudents s1=new CloneStudents(101,"amit");

            CloneStudents s2=(CloneStudents)s1.clone();

            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);

            System.out.println("This is by copy constuctor method");
            CopyContructer cp=new CopyContructer(121,"prajjwal");
            CopyContructer cp2=new CopyContructer(cp);
            System.out.println(cp.rollno+" "+cp.name);
            System.out.println(cp2.rollno+" "+cp2.name);


        }catch(CloneNotSupportedException c){}

    }

}
