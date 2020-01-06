package constructure;

import java.util.Random;
public class RandomTest {
	public RandomTest(){
		System.out.println("난수 = "+ Math.random());
		System.out.println("난수 = "+new Random().nextDouble());
		System.out.println("난수 = "+(new Random().nextInt(100) +1));
	}
    public static void main(String[] args) {
    	RandomTest rt = new RandomTest();
    }
}
