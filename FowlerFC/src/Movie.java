public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    Price price;
    public Movie(String name, int priceCode) {
        title = name;
        setPriceCode(priceCode);
    }
    public int getPriceCode() {
        return price.getPriceCode();
    }
    public void setPriceCode(int arg) {
        switch (arg) {
           case REGULAR:
           price = new RegularPrice();
           break;
           case CHILDRENS:
           price = new ChildrensPrice();
           break;
           case NEW_RELEASE:
           price = new NewReleasePrice();
           break;
        default:
       throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    double getCharge(int daysRented){
    	return price.getCharge(daysRented);
    }
    public String getTitle (){
        return title;
    }
    int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
  }
}