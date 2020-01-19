package networkEx;

import java.io.Serializable;

public class InfoDTO implements Serializable {
    private String nickName;
    private String msg;
    private String userIP;
    private Protocol code;
    public InfoDTO(String nickName, String userIP) {
    	this.nickName = nickName;
    }
    public void setCode(Protocol code) {
    	this.code = code;
    }
    public void setMsg(String msg) {
    	this.msg = msg;
    }
    public String getNickName() {
    	return nickName;
    }
    public String getUserIP() {
    	return userIP;
    }
    public String getMsg() {
    	return msg;
    }
    public Protocol getCode() {
    	return code;
    }
    public String toString() {
    	if(code == Protocol.ENTER) return nickName+Protocol.ENTER.getMsg();
    	if(code == Protocol.EXIT) return nickName+Protocol.EXIT.getMsg();
    	if(code == Protocol.SEND_MESSAGE) return "["+nickName+"]" +Protocol.SEND_MESSAGE.getMsg()+ msg;
    	
    	return null;
    }
}
