package constructure;

public class MemberDTO {
    private String name, phoneNumber, address;
    private int age;
    public void setName(String name) {
    	this.name = name;
    }
    public void setPhoneNumber(String phoneNumber) {
    	this.phoneNumber = phoneNumber;
    }
    public void setAddress(String address) {
    	this.address = address;
    }
    public void setAge(int age) {
    	this.age = age;
    }
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
    
}
