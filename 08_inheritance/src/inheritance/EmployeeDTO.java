package inheritance;

import java.text.DecimalFormat;

public class EmployeeDTO {
	private int id;
	private String name, position;
	private int basePay, benefit, salary;
	private double taxRate;
    
	public EmployeeDTO() {
    	
    }
	
    public EmployeeDTO(int id, String name) {
    	this.id = id;
    	this.name = name;
    }
    
    public void setPosition(String position) {
    	this.position = position;
    }
    public void setBasePay(int basePay) {
    	this.basePay = basePay;
    }
    public void setBenefit(int benefit) {
    	this.benefit = benefit;
    }
    public void setSalary() {
    	this.salary = basePay + benefit - (int)((basePay + benefit) * taxRate);
    }
    public void setTaxRate() {
    	if(basePay > 4000000) {
    		taxRate = 0.03;
    	}else if(basePay > 2000000) {
    		taxRate = 0.02;
    	}else {
    		taxRate = 0.01;
    	}
    }
    public int getId() {
    	return id;
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
	public int getSalary() {
		return salary;
	}
	public double getTaxRate() {
		return taxRate;
	}
    
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
    	
		return id+1+"\t"
				+name+"\t"
				+position+"\t"
				+df.format(basePay)+"\t"
				+df.format(benefit)+"\t\t"
				+taxRate+"\t"
				+df.format(salary)+"\t";
    		
	}
    
}
