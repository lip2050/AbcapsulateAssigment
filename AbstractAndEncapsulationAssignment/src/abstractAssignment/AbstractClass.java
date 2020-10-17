package abstractAssignment;

public abstract class AbstractClass {
	
	// We are getting an error below because the method has a body or code written in it (i.e. "System.out.println("First Method");"
	// Abstract classes contain methods only.
	// Methods in abstract classes don't have codes in them.
	abstract void abstractMethod(){
	        System.out.println("First Method");
	
	}

}
