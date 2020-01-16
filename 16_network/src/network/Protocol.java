package network;

enum Command{
	ENTER("100"),EXIT("200"),SEND_MESSAGE("300");
	
	public final String command;
	private Command(String command) {
		this.command = command;
	}
	public String getCommand() {
		return command;
	}
}
public final class Protocol {
	
	public static void main(String[] args) {
		
	}
}
