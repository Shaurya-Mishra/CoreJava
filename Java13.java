public class Java13 {
    int meth1(int a,int b) //meth2()
    {
        System.out.println(a);
        System.out.println(a-b);
        return new Java13().meth4(a-1,"hi");
    }
    String meth2(int x)//main()
    {
        System.out.println(x-new Java13().meth1(200,199));
        System.out.println(x);
        return "Java";
    }
    String meth3(int a,int b,String s)
    {
        System.out.println(a);
        System.out.println(a+a);
        System.out.println(a+b);
        return s;
    }
    int meth4(int a, String s)
    {
        System.out.println(a);
        System.out.println(s);
        return a+a;
    }
    String meth5(String s)
    {
        return s;
    }
    public static void main(String[] args) {
        System.out.println(new Java13().meth5(new Java13().meth3(15,25,new Java13().meth2(500))));
    }
    
}
