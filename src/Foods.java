

public class Foods {
	String Author,Publication_month,food_name;
	double pages,food_price;
	
	public Foods(String food_name,double food_price) {
		this.food_name=food_name;
		this.food_price = food_price;
	}

	public String getFood_name() {
		return food_name;
	}

	public void setFood_name(String food_name) {
		this.food_name = food_name;
	}

	public double getFood_price() {
		return food_price;
	}

	public void setFood_price(int food_price) {
		this.food_price = food_price;
	}
}
