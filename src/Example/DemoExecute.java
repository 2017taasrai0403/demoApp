package Example;

import Base.DemoBase;


public class DemoExecute extends DemoBase{

	//static String driver=super(driver);
	public DemoExecute(String driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void demoExecution()
	{
		System.out.println(driver);
	}
	
	public static void main(String args[])
	{
		DemoExecute de=new DemoExecute(driver);
		de.demoExecution();
	}
	
}
