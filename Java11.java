public class Java11 {
    int meth1()
    {
        System.out.println(12);
        return new Java11().meth2()+1;
    }
    int meth2()
    {
        System.out.println(20);
        return 99;
    }
    public static void main(String[]args){
        System.out.println(new Java11().meth1()-99);
    }
    
}
