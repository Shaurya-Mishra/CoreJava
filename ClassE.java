public class ClassE 
{
	void meth1()
	{
		System.out.println("i am good person");
		return;
	}
	public ClassE(int a)
		{
			System.out.println("Parmeterized constructor:" +a);
			return;
		}
	  ClassE()
	{
		System.out.println("default Constructor");
		return;
	}
    public static void main(String[] args) 
	{
      ClassE aobj= new ClassE(34);
      aobj.meth1(); 
	}

}
