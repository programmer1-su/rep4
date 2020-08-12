package rep4;

public abstract class Shape {//if inside class of one method is abstract, class must be abstract
	String name = "鈴木";
	
	public void task() {
		System.out.println("Task!");
	}
	
	public abstract void doIt();//abstract class have no body
}
