public class java3 {
    void meth1()//main()
    {
        System.out.println(10);
        java3 aboj = new java3();
        aboj.meth3();
        System.out.println( "good morning");
    }
    
    void meth2 ()//main()
    {
        int a= 10;
        System.out.println((a+4));
        java3 aboj = new java3();
        aboj.meth4();
        System.out.println( "harry");

    }
    void meth3() //meth1()
    {
        System.out.println(88);
        System.out.println(78);
    }
    void meth4(){ //main()
        System.out.println("reasler");
        System.out.println("real world");
    }
    public static void main(String[] args) { //main method
        System.out.println("start");
        java3 aboj = new java3();//creating a object
        aboj.meth1();//calling method
        aboj.meth4();
        aboj.meth2();
    }
}
