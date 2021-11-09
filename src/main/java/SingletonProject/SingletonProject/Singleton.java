package SingletonProject.SingletonProject;

public class Singleton {
    private  static Singleton singletonInstance;
    
	private Singleton() {

	}
	
	public synchronized  static Singleton getInstance(){
		if(singletonInstance == null) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}
	
	
      
	
}
