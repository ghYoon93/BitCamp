package abstract_1;

import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;

public class NumberTest {
    public static void main(String[] args) {
    	NumberFormat nf = new DecimalFormat();
    	// 3자리 마다 , 찍고 소수 이하 셋째 자리
        System.out.println(nf.format(12345678.456789));
        System.out.println(nf.format(12345678));
        System.out.println();
        
        NumberFormat nf2 = new DecimalFormat("#,###.##원");
        System.out.println(nf2.format(12345678.456789));
        System.out.println(nf2.format(12345678));
        System.out.println();
        
        NumberFormat nf3 = new DecimalFormat("#,###.00원");
        System.out.println(nf3.format(12345678.456789));
        System.out.println(nf3.format(12345678));
        System.out.println();
        
//        NumberFormat nf4 = NumberFormat.getInstance(); // 메소드를 이용한 생성
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(); // 원 표시
        nf4.setMaximumFractionDigits(2);
        nf4.setMinimumFractionDigits(2);  // 소수 둘째자리까지 강제 표시
        System.out.println(nf4.format(12345678.456789));
        System.out.println(nf4.format(12345678));
        System.out.println();
        
        NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); // 원 표시
        nf5.setMaximumFractionDigits(2);
        nf5.setMinimumFractionDigits(2);  // 소수 둘째자리까지 강제 표시
        System.out.println(nf5.format(12345678.456789));
        System.out.println(nf5.format(12345678));
        System.out.println();
        
	}
}
