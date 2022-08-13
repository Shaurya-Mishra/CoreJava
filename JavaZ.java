public class JavaZ
{
    void meth1()
    {
        System.out.println(10);
        System.out.println(64);
        System.out.println("end");
    }
      int meth2(int a,int b,int c)
    {
        System.out.println(a);
        JavaZ bobj = new JavaZ();
        String s = bobj.meth5(100,"Java is awesome");
        System.out.println(s);
        return a-b;
    }
    String meth3(String s, int b,int a)
    {
        System.out.println(b+a);
        return s;
    }
    int meth4(int c,int k)
    {
        
        System.out.println(k);
        JavaZ bobj = new JavaZ();
        int result= bobj.meth2(50,50,50);
        System.out.println(result);
        return k+10;
    }
    String meth5(int a,String s)
    {
        System.out.println(a+a);
        JavaZ bobj= new JavaZ();
        String S= bobj.meth3("hi",15,10);
        System.out.println(s);
        return S;
    }
    public static void main(String[] args) {
        JavaZ bobj = new JavaZ();
        System.out.println("Start");
        int result = bobj.meth4(20,10);
        System.out.println(result);
        bobj.meth1();
    }
}
