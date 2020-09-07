//CREATING A STUDENT CLASS FOR OVERLOAD3 WITH OVERLOADING OF SETTER METHODS FOR GIVING USER FLEXIBILITY
public class STUDENT												//USER DEFINED METHOD
{
	private int SNO;
	private String NAME,COURCE,FACULTY,TIME;
	public void setData(int s,String n)								//METHOD FOR SETTING DATA WITH ONLY TWO ARGUMENTS
	{
		SNO=s;
		NAME=n;
	}
	public void setData(int s,String n,String c)					//METHOD FOR SETTING DATA WITH THREE ARGUMENTS
	{
		SNO=s;
		NAME=n;
		COURCE=c;
	}
	public void setData(int s,String n,String c,String t)			//METHOD FOR SETTING DATA WITH FOUR ARGUMENTS
	{
		SNO=s;
		NAME=n;
		COURCE=c;
		TIME=t;
	}
	public void setData(int s,String n,String c,String f,String t)	//METHOD FOR SETTING DATA WITH FIVE ARGUMENTS
	{
		SNO=s;
		NAME=n;
		COURCE=c;
		TIME=t;
		FACULTY=f;
	}
	public int getSno()												//METHODS FOR GETTING DATA
	{
		return SNO;
	}
	public String getName()
	{
		return NAME;
	}
	public String getCource()
	{
		return COURCE;
	}
	public String getFaculty()
	{
		return FACULTY;
	}
	public String getTime()
	{
		return TIME ;
	}

}