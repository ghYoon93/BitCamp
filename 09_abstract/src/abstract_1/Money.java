package abstract_1;

import java.text.NumberFormat;

public abstract class Money {
	protected int cashKor;
	protected double exchangedCash;
	public  Money(int cashKor) {
		this.cashKor = cashKor;
	}
    public abstract void calcMoney();
    public abstract void dispMoney();
    
    public String toString() {
    	NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
    	return numberFormat.format(cashKor);
    }
}
