package OnlineShop;

public class MP3Player extends Electronics{
    private String color;

    public MP3Player(double regularPrice, String manufacturer, String color){
        super(regularPrice, manufacturer);
        this.color = color;
    }

    @Override
    public double computeSalePrice() {
        return getRegularPrice() * 0.9;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
