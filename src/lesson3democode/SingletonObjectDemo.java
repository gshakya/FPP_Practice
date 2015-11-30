package lesson3democode;
class SingletonClass {
	// static SingletonClass singletonObject;
	private static SingletonClass singletonObject;
	String key;
	/** A private Constructor prevents any other class from instantiating. */
	
	 private SingletonClass() {
		System.out.println("Key is generated for you successfully");
		key = "K135J89L35";
	}
	public static SingletonClass getSingletonObject() {
		if (singletonObject == null) {
			singletonObject = new SingletonClass();
		}
		return singletonObject;
	}
	
	public void getKey(){ 
    	System.out.println("Your key to activate Avast anti virus is:"+key);   
    	}
}
public class SingletonObjectDemo {

		public static void main(String[] args) {
//		SingletonClass obj = new SingletonClass(); //Compilation error
	    SingletonClass obj = SingletonClass.getSingletonObject();
	    obj.getKey();
	}
}
