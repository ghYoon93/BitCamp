package class_1;

public class BookShop {
    private String bookName, author;
    int price;
    
    public void setBookName(String bookName){
    	this.bookName = bookName;
    }
    public void setAuthor(String author) {
    	this.author = author;
    }
    public void setPrice(int price){
    	this.price = price;
    }
    public String getBookName() {
    	return bookName;
    }
    public String getAuthor() {
    	return author;
    }
    public int getPrice() {
    	return price;
    }
    
    public static void main(String[] args) {
    	BookShop[] ar = new BookShop[2];
    	
    	ar[0] = new BookShop();
    	ar[0].setBookName("자바완성");
    	ar[0].setAuthor("김완성");
    	ar[0].setPrice(25000);
    	
    	ar[1] = new BookShop();
    	ar[1].setBookName("JSP잡기");
    	ar[1].setAuthor("송JP");
    	ar[1].setPrice(35000);
    	
    	for(BookShop data : ar) {
    		System.out.println("책 이름: "+data.getBookName());
    		System.out.println("저 자: "+data.getAuthor());
    		System.out.println("가 격: "+data.getPrice()+"원");
    		System.out.println();
    	}
	}
}