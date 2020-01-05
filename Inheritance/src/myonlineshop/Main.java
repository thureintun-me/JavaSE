package myonlineshop;

public class Main {
    public static void main(String[] args) {
        Product[] pa = new Product[5];

        pa[0] = new TV(2500,"Sony",45);
        pa[1] = new TV(1200,"Sony",32);
        pa[2] = new MP3Player(200,"Apple","Red");
        pa[3] = new Book(20,"Oracle",1999);
        pa[4] = new Book(25,"Sun Press",1989);

        double totalRegularPrice = 0;
        double totalComputeSalePrice = 0;

        for (int i=0;i<pa.length;i++){
            totalRegularPrice += pa[i].getRegularPrice();

            totalComputeSalePrice += pa[i].computeSalePrice();

            System.out.println("Item number " + i +
                    ": Type = " + pa[i].getClass().getName()+
                    ",Regular Price = " + pa[i].getRegularPrice()+
                    ",Sale Price = " + pa[i].computeSalePrice());
        }
        System.out.println("Total Regular Price : " + totalRegularPrice);
        System.out.println("Total Compute Sale Price : " + totalComputeSalePrice);

    }
}
