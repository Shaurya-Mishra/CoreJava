public class ClassC {
	String StudentName;
	int StudentId;
	String StudentDept;
	
	ClassC(String Name, int Id,String Dept)
	{
		StudentName = Name;
		StudentId = Id;
		StudentDept = Dept; 
	}
	

	public static void main(String[] args) 
	{
		ClassC aobj1 = new ClassC("Ram",24,"B.tech");
		ClassC aobj2 = new ClassC("Rohan",204,"B.tech");
		ClassC aobj3 = new ClassC("Rema",240,"B.tech");
		
		System.out.println(aobj1.StudentName+ " "+ aobj1.StudentId+ " "+aobj1.StudentDept);
		System.out.println(aobj2.StudentName+ " "+ aobj2.StudentId+ " "+aobj2.StudentDept);
		System.out.println(aobj3.StudentName+ " "+ aobj3.StudentId+ " "+aobj3.StudentDept);
	

	}
}	
