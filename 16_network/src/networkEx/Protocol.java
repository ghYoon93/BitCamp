package networkEx;

public enum Protocol {
	ENTER("¥‘¿Ã ¿‘¿Â«œºÃΩ¿¥œ¥Ÿ."),EXIT("¥‘¿Ã ≈¿Â«œºÃΩ¿¥œ¥Ÿ."),SEND_MESSAGE(": ");
	
	public final String msg;
	private Protocol(String msg) {
		this.msg = msg;                                                                                                                               
	}
	public String getMsg() {
		return msg;
	}
}
