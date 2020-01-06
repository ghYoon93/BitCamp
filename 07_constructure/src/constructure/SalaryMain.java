package constructure;

import java.text.DecimalFormat;

public class SalaryMain {
    public static void main(String[] args) {
    	SalaryDTO[] sDTO = new SalaryDTO[3];
    	sDTO[0] = new SalaryDTO("홍길동", "부장", 5000000, 200000);
    	sDTO[1] = new SalaryDTO("유재석", "과장", 3500000, 150000);
    	sDTO[2] = new SalaryDTO("박명수", "사원", 1800000, 100000);
    	DecimalFormat df = new DecimalFormat("#,###");
    	System.out.println("이름\t직급\t기본급\t\t수당\t\t세율\t세금\t월급");
    	for(SalaryDTO data : sDTO) {
    		data.calc();
    		System.out.println(data.getName()+"\t"+data.getPosition()+"\t"+df.format(data.getBasePay())+"\t"+df.format(data.getBenefit())+"\t\t"+String.format("%.2f", data.getTaxRate())
    		+"\t"+data.getTax()+"\t"+df.format(data.getSalary()));
    	}
    }
}
