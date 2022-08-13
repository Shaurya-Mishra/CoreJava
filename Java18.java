public class Java18
{
    int r = 39;//static variable
    int c = 45;// instance variable
    int x;
    static int y;
    boolean flag;
    void meth1()
    {
        int a = 20;
        System.out.println("Local variable:" +a);
        System.out.println("----------------");
        System.out.println("static variable:" +r);
        System.out.println("static variable:" + new Java18().r);
        System.out.println("static variable :" +Java18.r);
        System.out.println("----------------------");
        System.out.println("instance varible:" +c );
        System.out.println("instance variable :" +new Java18().c);
        System.out.println("=======================");

    }
     void meth2()
     {
        int r=100;
        int c= 200;
        int a= 700;
        System.out.println("meth2 called");
        System.out.println("instance variable :" +c);
        System.out.println("instance variable :" +new Java18().c);
        System.out.println("-----------------");
        System.out.println("static variable :" +r);
        System.out.println("static variable :" +Java18.r);
        System.out.println("static variable :" +new Java18().r);
        System.out.println("==================");
        System.out.println("local variable :" +a);
        System.out.println("+++++++++++++++++++++++");
     }
     void meth3()
     {
        System.out.println("static variable :" +y);
        System.out.println("instanc variable :" +x);
        System.out.println("local variable :" +flag);
     }

    public static void main(String[] args) {
        Java18 m=new Java18();
        m.meth1();
        m.meth2();
        m.meth3();
    }

}