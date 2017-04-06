package Base;

public class DemoUtility {
	
	public static String driver="Selenium driver";
	public DemoUtility( String driver)
	{
		DemoUtility.driver=driver;
		
	}
	public static void checkDriver(String driver)
	{
		System.out.println("This is DemoUtiltyDriver :"+ driver);
	}

	
}
