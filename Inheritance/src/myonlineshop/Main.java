package myonlineshop;

public class Main {

	public static void main(String[] args) {
		
		Product[] pa = new Product[7];
		
		pa[0] = new TV(1000, "Samsung", 30);
		pa[1] = new TV(2000, "Sony", 50);
		pa[2] = new MP3Player(250, "Apple","blue");
		pa[3] = new Book(34,"Sun Press",1992);
		pa[4] = new Book(15,"Korea Press",1986);
		pa[5] = new Camera(5000, "Sony");
		pa[6] = new Camera(6500, "Cannon");
		
		double totalRegularPrice = 0 ;
		double totalSalePrice = 0 ;
		
		for(int i=0;i<pa.length;i++) {
			totalRegularPrice += pa[i].getRegularPrice();
			
			totalSalePrice += pa[i].computeSalePrice();
			
			System.out.println("Item number " + i + " ; Type =" + pa[i].getRegularPrice() +
					" ,salePrice ="+pa[i].computeSalePrice());
			
		}
		
		System.out.println("TotalRegularPrice :" +totalRegularPrice);
		System.out.println("TotalSlaePrice : " + totalSalePrice);
		
	}

}
