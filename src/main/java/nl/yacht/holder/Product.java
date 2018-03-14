package nl.yacht.holder;

public class Product {

    private String productId;
    private String name;
    private String korting;
    private double prijs;


    public boolean blikje(boolean drinken){
        if(drinken){
            return true;
        }
            return false;

    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKorting() {
        return korting;
    }

    public void setKorting(String korting) {
        this.korting = korting;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public Product(String productId, String name, String korting, double prijs){
        this.productId = productId;
        this.name = name;
        this.korting = korting;
        this.prijs = prijs;
        //producten.createProductList();
    }


}
