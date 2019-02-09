package hospital;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Surgeon jerry = new Surgeon("Jerry", "888", false);
		Patient bob = new Patient("Bob", "002");
		jerry.toggleSurgery();
		System.out.println(jerry.getName() + " is performing surgery? " + jerry.getPerformingSurgery());
		

	}

}
