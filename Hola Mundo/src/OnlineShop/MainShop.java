package OnlineShop;

public class MainShop {
    public static void main(String[] args) {

        Product[] prods = new Product[5];
        prods[0] = new TV(1678.5,"SAMSUNG",40);
        prods[1] = new TV(874.3,"SONY",38);
        prods[2] = new MP3Player(105.30,"SONY","GRAY");
        prods[3] = new MP3Player(30.1,"ECU_MP3","AZUL");
        prods[4] = new Book(51.30,"MARIO VARGAS LLOSA",2010);


        double totalRegularPrice = 0.0;
        double totalSalePrice = 0.0;

        for(Product products : prods){
            totalRegularPrice += products.getRegularPrice();
            totalSalePrice += products.computeSalePrice();

            System.out.println("Item: " + products.getClass().getName() +
                    "\nRegular Price = " + products.getRegularPrice() +
                    "\nSale Price = " + products.computeSalePrice() );
            System.out.println();
        }

        System.out.println("Total regular price: " + totalRegularPrice);
        System.out.println("Total sale price: " + totalSalePrice);

    }
}
