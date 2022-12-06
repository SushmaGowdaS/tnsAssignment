package tnsAssignment2;

public class Assignment_state {


	public void methodAssignment_State()
	{
	System.out.println("state method");
	}
	}
	class city extends Assignment_state
	{
	public void methodcity()
	{
	System.out.println("city method");
	}
	}
	class district extends city
	{
	public void methoddistict()
	{
	System.out.println("district method");
	}
	public static void main(String[] args)
	{
	district obj=new district();
	obj.methodAssignment_State();
	obj.methodcity();
	obj.methoddistict();
	}
	}
	

