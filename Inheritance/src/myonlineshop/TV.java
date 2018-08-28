package myonlineshop;

public class TV extends Electronics {

	private int size ;
		
	public TV(double regularPrice, String manufacturer,int size) {
		super(regularPrice, manufacturer);
		this.size=size;
	}
	
	@Override
	public double computeSalePrice() {
		return super.getRegularPrice()* 0.8 - 100 ;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}
