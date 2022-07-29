package Week5HM;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println(buildMessage(log));
		
	}
	
	private String buildMessage(String msg) {
		return "***" + msg + "***";
	}

	@Override
	public void error(String error) {
		String asteriskMsg = buildMessage("Error: " + error);
		String asterisks = "*".repeat(asteriskMsg.length());
		
		System.out.println(asterisks);
		System.out.println(asteriskMsg);
		System.out.println(asterisks);
		
	}


	}

