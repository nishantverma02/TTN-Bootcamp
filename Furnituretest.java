interface Furniture{
    void stresstest();
    void firetest();
}
class Woodenchair implements Furniture{

    @Override
    public void firetest() {
        System.out.println("test for woodenchair");
        System.out.println("fire test failed");
    }

    @Override
    public void stresstest() {
        System.out.println("stress test passed");
        System.out.println("------------------------------------");
    }
}
class Woodentable implements Furniture{
    @Override
    public void stresstest() {
        System.out.println("test for woodentable");
        System.out.println("stress test passed");
    }

    @Override
    public void firetest() {
        System.out.println("fire test failed");
        System.out.println("----------------------------------");
    }
}
class MetleChair implements Furniture {
    @Override
    public void firetest() {
        System.out.println("test for metlechair");
        System.out.println("fire test passed");
    }

    @Override
    public void stresstest() {
        System.out.println("stress test failed");
        System.out.println("---------------------------------------");
    }
}
class MetleTable implements Furniture{

    @Override
    public void stresstest() {
        System.out.println("test for Metletable");
        System.out.println("stress test failed");
    }

    @Override
    public void firetest() {
        System.out.println("fire test passed");
        System.out.println("-------------------------------------");
    }
}

public class Furnituretest {
    public static void main(String[] args) {
        Woodenchair wc=new Woodenchair();
        wc.firetest();
        wc.stresstest();

        Woodentable wt=new Woodentable();
        wt.stresstest();
        wt.firetest();




        MetleChair mc=new MetleChair();
        mc.firetest();
        mc.stresstest();

        MetleTable mt=new MetleTable();
        mt.stresstest();
        mt.firetest();

    }
}
