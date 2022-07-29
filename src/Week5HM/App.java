package Week5HM;

public class App {
	public static void main(String[] args) {
		Logger asterisk = new AsteriskLogger();
		Logger spaced = new SpacedLogger();
		
		asterisk.log("Hello");
		asterisk.error("Evening");
		
		System.out.println();
		
		spaced.log("Hello");
		spaced.error("Evening");

	}

}
