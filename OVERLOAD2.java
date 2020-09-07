//EXAMPLE ON OVERLODING OF METHOD BY CHANGING NUMBER OF ARGUMENTS
class OVERLOAD2
{												//SAME METHOD BUT DIFFERENT NUMBER OF ARGUMENTS(POLYMORPHISM)
	void add(int x,int y)						//USER DEFINED METHOD WITH TWO ARGUMENTS
	{
		System.out.println("SUM IS:"+(x+y));
	}
	void add(int x,int y,int z)					//USER DEFINED METHOD WITH THREE ARGUMENTS
	{
		System.out.println("SUM IS:"+(x+y+z));
	}
		public static void main(String[]args)	//MAIN METHOD
	{
		OVERLOAD2 o1=new OVERLOAD2();			//CREATING AND ASSIGNING A REFERENCE(o1) TO OBJECT
		o1.add(5,9);							//CALLING A METHOD WITH TWO ARGUMENTS
		o1.add(5,4,8);							//CALLING A METHOD WITH THREE ARGUMENTS
		}
}