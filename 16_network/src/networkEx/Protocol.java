package networkEx;

public enum Protocol {
	ENTER("���� �����ϼ̽��ϴ�."),EXIT("���� �����ϼ̽��ϴ�."),SEND_MESSAGE(": ");
	
	public final String msg;
	private Protocol(String msg) {
		this.msg = msg;                                                                                                                               
	}
	public String getMsg() {
		return msg;
	}
}
