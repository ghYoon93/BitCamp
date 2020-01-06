package abstract_1;

public abstract class AbstractTest { // POJO (Plain Old Java Object) 가장 original한 class의 구조
    protected String name;
    
    public abstract void setName(String name); // 추상 메소드 
    public String getName() {
    	return name;
    }
        
    
}
