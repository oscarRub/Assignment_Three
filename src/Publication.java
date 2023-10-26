
public class Publication {
	
	String Author,Publication_month,book_name;
	int pages;
	double book_price;
	
	public Publication(String book_name,double book_price2 ) {
		this.book_name=book_name;
		this.book_price = book_price2;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public  double getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

	
	
	
	//public String Publication() {
	//	return null;
	
	//}
	
}
