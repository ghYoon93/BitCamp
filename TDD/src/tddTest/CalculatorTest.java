package tddTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	//@Test(timeout=5000)  : �ð����� : �и���
	//@Test(expected=RuntimeException.class) : RuntimeException�� �߻��ؾ� ����
	//@Ignore(value=��test��)
	
	//@Before �ش� �׽�Ʈ Ŭ������ ��ü�� �ʱ�ȭ�ϴ� �۾�
	//@After �ش� �׽�Ʈ  ���� �� ����
	
	//@BeforeClass �׽�Ʈ Ŭ���� ���� �� �ѹ� ����
	//@AfterClass �׽�Ʈ Ŭ���� ���� �� �ѹ� ����
	@Test
	public void testSum( ) {
		Calculator cal = new Calculator();
		int result = cal.sum(10, 30);
		assertEquals(40,  cal.sum(10, 30));
	}
}
