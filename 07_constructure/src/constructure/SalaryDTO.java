package constructure;

// SalaryDTO.java DTO Data Transfer Object -> 1ÀÎºĞ¿ë 
// SalaryVO.java Value Object
// SalaryBean.java
public class SalaryDTO {
	private String name, position;
	private int basePay, benefit, tax, salary;
	double taxRate;
	
	public SalaryDTO(String name, String position, int basePay, int benefit) {
		this.name = name;
		this.position = position;
		this.basePay = basePay;
		this.benefit = benefit;
	}
	
	public void calc() {
		if(basePay > 4000000) {
			taxRate = 0.03;
		}else if(basePay > 2000000) {
			taxRate = 0.02;
		}else {
			taxRate = 0.01;
		}
		tax = (int)((basePay+benefit) * taxRate);
		salary = basePay+benefit-tax;
		
		
	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public int getBasePay() {
		return basePay;
	}

	public int getBenefit() {
		return benefit;
	}

	public int getTax() {
		return tax;
	}

	public int getSalary() {
		return salary;
	}

	public double getTaxRate() {
		return taxRate;
	}
}
