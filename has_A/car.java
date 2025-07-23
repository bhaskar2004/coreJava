package has_A;

public class car{
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    car(String brand){
        this.brand=brand;
    }
    engine e=new engine(240.5);
}