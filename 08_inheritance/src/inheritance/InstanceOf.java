package inheritance;

class AAA{}
class BBB extends AAA{}
public class InstanceOf {
    public static void main(String[] args) {
    	AAA aa = new AAA();
    	BBB bb = new BBB();
    	AAA aa2 = new BBB();
    	
    	AAA aa3 = aa;
    	if(aa instanceof AAA)System.out.println("1. TRUE");
    	else System.out.println("1. FALSE");
    	
    	if(bb instanceof AAA)System.out.println("2. TRUE");
    	else System.out.println("2. FALSE");
    	
    	if(aa3 instanceof BBB)System.out.println("3. TRUE");
    	else System.out.println("3. FALSE");
    	// BBB bb2 = (BBB) aa; - error;
    	BBB bb3 = (BBB)aa2;
    	if(bb3 instanceof BBB)System.out.println("4. TRUE");
    	else System.out.println("4. FALSE");
    }
}
