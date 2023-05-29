package OnlineShop;

public class TV extends Electronics{

    private final int size;
    public TV(double regularPrice, String manufacturer, int size){
        super(regularPrice, manufacturer);
        if(size < 0.0){
            throw new IllegalArgumentException("Size must be >= 0.0u");
        }
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public double computeSalePrice() {
        return super.getRegularPrice() * 0.9;
    }
}
