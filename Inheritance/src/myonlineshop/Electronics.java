package myonlineshop;

public class Electronics extends Product {
	
	private String manufacturer;
	
	public Electronics(double regularPrice,String manufacturer) {
		super(regularPrice);
		this.manufacturer=manufacturer;
	}

	@Override
	public double computeSalePrice() {
		
		return super.getRegularPrice() * 0.6 ;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	
	
	
}
