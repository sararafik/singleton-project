package SingletonProject.SingletonProject;


public class App 
{
    public static void main( String[] args )
    {
    	Singleton instanceOne = Singleton.getInstance();
		System.out.println("instanceOne"+instanceOne);
		Singleton instanceTwo = Singleton.getInstance();
		System.out.println("instanceTwo"+instanceTwo);
    }
}
