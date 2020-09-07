//EXAMPLE ON POLYMORPHISM IN DEVOLPING METHODS
public class OVERLOAD3													//MAIN METHOD
{
	public static void main(String arg[])
	{
		STUDENT s1=new STUDENT();								//CREATING AN OBJECT WITH REFERENCE(s1)
		s1.setData(01,"PRASANTH","JAVA","SK","11 TO 1");	//CALLING A METHOD FROM ANOTHER CLASS AND ASSIGNING DYNAMIC VAUES
		System.out.println("SNO"+"\t"+"APPLICANT"+"\t"+"COURSE"+"\t"+"FACULTY"+"\t"+"TIME");
		System.out.println(s1.getSno()+"\t"+s1.getName()+"\t"+s1.getCource()+"\t"+s1.getFaculty()+"\t"+s1.getTime());
		STUDENT s2=new STUDENT();								//CREATING A OBJECT WITH REFERENCE
		s2.setData(02,"PRAKASH");								//CALLING A METHOD FROM ANOTHER CLASS
		System.out.println(s2.getSno()+"\t"+s2.getName()+"\t"+s2.getCource()+"\t"+s2.getFaculty()+"\t"+s2.getTime());

	}
}
