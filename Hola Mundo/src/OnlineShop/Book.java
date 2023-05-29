package OnlineShop;

public class Book extends Product{
    private String publisher;
    private int yearPublished;

    public Book(double regularPrice,
                String publisher, int yearPublished){
        super(regularPrice);
        if(yearPublished < 0){
            throw new IllegalArgumentException("Year of publication must be >= 0");
        }

        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }

    @Override
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.5;
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}
