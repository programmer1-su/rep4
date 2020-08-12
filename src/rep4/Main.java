package rep4;

public class Main extends Shape{

	public static void main(String[] args) {
		new Main().task();
		System.out.println(new Main().name);
	}


	@Override
	public void doIt() {
		System.out.println("Hello!");
	}

}
