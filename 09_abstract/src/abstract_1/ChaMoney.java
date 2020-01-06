package abstract_1;

import java.text.NumberFormat;
import java.util.Locale;

public class ChaMoney extends Money{
	private double EXCHANGE_RATE = 0.00601106;
    private double cashCha;
    
    public ChaMoney(int cashKor) {
		super(cashKor);
	}
    
    public void calcMoney() {
    	cashCha = super.cashKor * EXCHANGE_RATE;
    }
    public void dispMoney() {
    	NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
    	System.out.print(numberFormat.format(cashKor) + " -> ");
    	numberFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
    	numberFormat.setMaximumFractionDigits(2);
    	System.out.println(numberFormat.format(cashCha));
    }
}
