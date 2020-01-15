package collection;

public class PersonDTO implements Comparable<PersonDTO>{
	private String name;
	private int age;
	
	
	public PersonDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름: "+name+"\t나이"+age;
	}
	public int compareTo(PersonDTO dto) {
		// TODO Auto-generated method stub
		if(age < dto.age) return -1;
		else if(age == dto.age) return 0;
		else return 1;
	}
}
