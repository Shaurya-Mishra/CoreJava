public class Java15 
{
    int meth1()
    {
        System.out.println("meth1 is called");
        return 10;
    }
    public static void main(String[] args) 
    {
        Java15 aobj1= new Java15();
        Java15 aobj2= new Java15();
       //int aobj1 hashCode =aobj1.hashCode();
        //int aobj2 hashCode = aobj2 hashCode();

        //System.out.println(" aobj1 hashCode is:" +aobj1 hashCode);
       // System.out.println("aobj2 hashCode is:"+ aobj2 hashCode);
        
        System.out.println(aobj1.equals (aobj2));
        System.out.println(aobj1.equals(aobj1));
        System.out.println(aobj2.equals(aobj2));
        System.out.println("------------------");

        System.out.println(aobj1.getClass());
        System.out.println(aobj2.getClass());
        System.out.println("----------------");

          System.out.println(aobj1.toString());
          System.out.println(aobj2.toString());

    }
    
}
