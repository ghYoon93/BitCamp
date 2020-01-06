package abstract_1;

import java.text.NumberFormat;
import java.util.Locale;

public class JpaMoney extends Money {
	private double EXCHANGE_RATE = 0.09398231;
	private double cashJpa;
	
	public JpaMoney(int cashKor) {
		super(cashKor);
	}
	
	public void calcMoney() {
		cashJpa = super.cashKor * EXCHANGE_RATE;
	}
    public void dispMoney() {
    	NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
    	System.out.print(numberFormat.format(cashKor) + " -> ");
    	numberFormat = NumberFormat.getCurrencyInstance(Locale.JAPAN);
    	numberFormat.setMaximumFractionDigits(2);
    	System.out.println(" -> "+numberFormat.format(cashJpa));
    }
}
