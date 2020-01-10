package swing;

public class PersonDTO {
    private String id;
    private String name;
    private String pwd;
    private String tel;
    
    public PersonDTO(String id, String name, String pwd, String tel) {
    	this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.tel = tel;	
    }
    
    
    public void setId(String id) {
    	this.id = id;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void setPwd(String pwd) {
    	this.pwd = pwd;
    }
    public void setTel(String tel) {
    	this.tel = tel;
    }
    
    public String getId() {
    	return id;
    }
    public String getName() {
    	return name;
    }
    public String getPwd() {
    	return pwd;
    }
    public String getTel() {
    	return tel;
    }
}
