package myonlineshop;

public class MP3Player extends Electronics {
	
	private String color;
	
	public MP3Player(double regularPrice, String manufacturer,String color) {
		super(regularPrice, manufacturer);
		this.color=color;
	}

	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public double computeSalePrice() {
		return super.getRegularPrice()*0.9 - 15;
	}
	
	
	
}
