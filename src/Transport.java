import java.time.LocalDate;

public class Transport {

    private String brand;
    private String model;
    private String colour;
    private final int year;
    private final String country;
    private int maxSpeed;


    public Transport(String brand, String model, String colour, int year, String country, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        setColour(colour);
        if (year>=0){
         this.year=LocalDate.now().getYear() - year;
        } else {
            this.year = LocalDate.now().getYear() - Math.abs(year);
        }
        if (country !=null && !country.isBlank() && !country.isEmpty()){
            this.country = country;
        }else {
            this.country = "Default";
        }
        setMaxSpeed(maxSpeed);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (colour != null && !colour.isEmpty() && !colour.isBlank()) {
            this.colour = colour;
        }else {
            this.colour = "Не известно";
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        }

    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public void info(){

        System.out.println(this);
    }
}


