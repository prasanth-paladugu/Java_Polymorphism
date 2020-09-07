//EXAMPLE ON OVERLODING OF METHOD BY CHANGING DATATYPES OF ARGUMENTS
class OVERLOAD1
{												//SAME METHOD BUT ARGUMENTS OF DIFFERENT DATATYPES(POLYMORPHISM)
	void add(int x,int y)						//USER DEFINED METHOD WITH TWO INT ARGUMENTS
	{
		System.out.println("SUM IS:"+(x+y));
	}
	void add(String x,String y)					//USER DEFINED METHOD WITH TWO STRING ARGUMENTS
	{
		System.out.println("SUM IS:"+(x+y));
	}
	void add(double x,double y)					//USER DEFINED METHOD WITH TWO DOUBLE ARGUMENTS
	{
		System.out.println("SUM IS:"+(x+y));
	}
	void add(int x,String y)					//USER DEFINED METHOD WITH A INT AND STRING ARGUMENTS
	{
		System.out.println("SUM IS:"+(x+y));
	}
	void add(char x,String y)					//USER DEFINED METHOD WITH A CHAR AND STRING ARGUMENTS
	{
		System.out.println("SUM IS:"+(x+y));
	}
	public static void main(String[]args)		//MAIN METHOD
	{
		OVERLOAD1 o1=new OVERLOAD1();			//CREATING AND ASSIGNING A REFERENCE(o1) TO OBJECT
		o1.add(5,9);							//CALLING A METHOD WITH TWO INT ARGUMENTS
		o1.add("PRASANTH","PANDU");				//CALLING A METHOD WITH TWO STRING ARGUMENTS
		o1.add(5.8,5.4);						//CALLING A METHOD WITH TWO DOUBLE ARGUMENTS
		o1.add(10,"APPLES");					//CALLING A METHOD WITH A INT AND STRING ARGUMENTS
		o1.add('P',"PRASANTH");					//CALLING A METHOD WITH A CHAR AND STRING ARGUMENTS
	}
}