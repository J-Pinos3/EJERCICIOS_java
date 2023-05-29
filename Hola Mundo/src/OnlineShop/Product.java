package OnlineShop;

public abstract class Product {

    private double regularPrice;


    public Product(double regularPrice){
        if(regularPrice < 0.0){
            throw new IllegalArgumentException("Regular price must be >= 0.0$");
        }
        this.regularPrice = regularPrice;
    }


    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }


    public abstract double computeSalePrice();




}
