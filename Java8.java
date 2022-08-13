public class Java8 {
    void meth1(int a, int b)
    {
        System.out.println("meth1() called");
        System.out.println(a);
    }
    int meth2()
    {
        System.out.println("meth2() is called");
        return 1000;
    }
    int meth3(int a,int b, int c)
    {
        System.out.println("methd() 3 called");
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println("start");
        Java8 aobj=new Java8();
        aobj.meth1(10,20);
        System.out.println("===---========-----------");
        int result= aobj.meth2();
        System.out.println("result:"+result);
        System.out.println("==============------=======");

        int val= aobj.meth3(5,5,5);
        System.out.println("result:" +val);
        System.out.println("======++++++");
        System.out.println("End");
    }
    
}
