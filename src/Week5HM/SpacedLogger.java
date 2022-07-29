package Week5HM;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println(buildMessage(log));
	}
	
	private String buildMessage(String msg) {
		StringBuilder b = new StringBuilder();
		
		for(int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			b.append(ch).append(" ");
		}
		
		b.setLength(b.length() - 1);
		
		return b.toString();
	}

	@Override
	public void error(String error) {
		System.out.println("Error: " + buildMessage(error));
		
	}

}
