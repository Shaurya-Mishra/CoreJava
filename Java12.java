public class Java12 {
    String meth1(int a,int b)
    {
        System.out.println(10);
        System.out.println((54+a)-b);
        int value = new Java12(). meth5();
        System.out.println(value);
        return "Java";
    }
    int meth2(int a)
    {
        System.out.println(a);
        return 100;
    }
    void meth3()
    {
        System.out.println("my name is phenomena");

    }
    String meth4()
    {
        System.out.println("Today is rainy");
        return new Java12().meth1(1,8);

    }
    int meth5()
    {
        Java12 obj = new Java12();
        System.out.println(99);
        return obj.meth2(5);
    }
    public static void main(String[] args) 
    {
        System.out.println("Start");
        Java12 aobj= new Java12();
        aobj.meth1(12,223);
        aobj.meth2(87);
        aobj.meth3();
        aobj.meth4();
        aobj.meth5();
        System.out.println("End");
        
    }
    
}
