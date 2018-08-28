package myonlineshop;

public class Camera extends Electronics {

	public Camera(double regularPrice, String manufacturer) {
		super(regularPrice, manufacturer);
	}
	
	public double computeSalePrice() {
		return super.getRegularPrice()*0.7;
	}
	
	
}
