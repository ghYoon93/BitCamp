package constructure;

import java.text.DecimalFormat;

public class SalaryMain {
    public static void main(String[] args) {
    	SalaryDTO[] sDTO = new SalaryDTO[3];
    	sDTO[0] = new SalaryDTO("ȫ�浿", "����", 5000000, 200000);
    	sDTO[1] = new SalaryDTO("���缮", "����", 3500000, 150000);
    	sDTO[2] = new SalaryDTO("�ڸ��", "���", 1800000, 100000);
    	DecimalFormat df = new DecimalFormat("#,###");
    	System.out.println("�̸�\t����\t�⺻��\t\t����\t\t����\t����\t����");
    	for(SalaryDTO data : sDTO) {
    		data.calc();
    		System.out.println(data.getName()+"\t"+data.getPosition()+"\t"+df.format(data.getBasePay())+"\t"+df.format(data.getBenefit())+"\t\t"+String.format("%.2f", data.getTaxRate())
    		+"\t"+data.getTax()+"\t"+df.format(data.getSalary()));
    	}
    }
}
