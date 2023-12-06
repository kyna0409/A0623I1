package bt.model;

public class HangGoods extends Phone{

    private String country;
    private String status;

    public HangGoods(String id, String name, double price, String brand, String country, String status) {
        super(id, name, price, brand);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return String.format("%s , %s , %s , %s , %s , %s ",getId(),getName(),getPrice(),getBrand(),getCountry(),getStatus());
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
