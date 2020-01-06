package abstract_1;

import java.text.NumberFormat;
import java.util.Locale;

public class EngMoney extends Money{
	private double EXCHANGE_RATE = 0.00086393089;
	private double cashEng;
	
	public EngMoney(int cashKor) {
		super(cashKor);
	}
	
	public void calcMoney() {
		cashEng = super.cashKor * EXCHANGE_RATE;
	}
    public void dispMoney() {
    	NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
    	System.out.print(numberFormat.format(cashKor) + " -> ");
    	numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
    	numberFormat.setMaximumFractionDigits(2);
    	System.out.println(numberFormat.format(cashEng));
    	
    }
    
}
