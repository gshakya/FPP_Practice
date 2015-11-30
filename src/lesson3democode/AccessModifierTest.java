package lesson3democode;

public class AccessModifierTest {
	
	public static void main (String[] args){
		AccessModifier am = new AccessModifier();
		MyClass1 mc = new MyClass1();
		
		mc.setValue(1, 2 ,3, 4);
		mc.getvalue();
	}

}
