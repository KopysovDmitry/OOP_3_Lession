import java.time.LocalDate;

public  class  Car extends Transport{

    private double engineVolume;

    private String transmission;

    private final String body;

    private final String number;

    private final int seats;

    boolean summerTyres;

    public Car(String brand,
               String model,
               double engineVolume,
               String colour,
               int year,
               String country,
               int maxSpeed,
               String transmission,
               String body,
               String number,
               int seats,
               boolean summerTyres
    ) {

        super (brand,model,colour,year,country,maxSpeed);

        if (engineVolume != 0){
            this.engineVolume = engineVolume;
        }else {
            this.engineVolume = 2000;
        }
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()){
            this.transmission = transmission;
        } else {
            this.transmission = "Default";
        }
        if (body != null && !body.isEmpty() && !body.isBlank()){
            this.body = body;
        } else {
            this.body = "Default";
        }
        if (number != null && !number.isEmpty() && !number.isBlank()){
            this.number = number;
        } else {
            this.number = "x000x000";
        }
        if (seats <5){
            seats = 5;
        }
        this.seats = seats;

    }

    public String getBody() {
        return body;
    }

    public String getNumber() {
        return number;
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {

    }

    public String getBodyTip() {
        return body;
    }

    public String getnumber() {
        return number;
    }

    public int getAmountSeats() {
        return seats;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }
    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }
    public void changeTires(){
        setSummerTyres(!summerTyres);
    }
    public boolean isValidNumber(){
        boolean result = true;
        result = result && number.length()==9;
        result = result && Character.isLetter(number.charAt(0));
        result = result && Character.isDigit(number.charAt(1));
        result = result && Character.isDigit(number.charAt(2));
        result = result && Character.isDigit(number.charAt(3));
        result = result && Character.isLetter(number.charAt(4));
        result = result && Character.isLetter(number.charAt(5));
        result = result && Character.isDigit(number.charAt(6));
        result = result && Character.isDigit(number.charAt(7));
        result = result && Character.isDigit(number.charAt(8));
        return result;
    }
    @Override
    public void refill() {
        System.out.println("я заправляюсь бензином");
    }

    @Override
    public String toString() {

        return "Car{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + engineVolume +
                ", colour='" + getColour() + '\'' +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", transmission='" + transmission + '\'' +
                ", body='" + body + '\'' +
                ", number='" + number + '\'' +
                ", seats=" + seats +
                ", summerTyres=" + summerTyres +
                '}';
    }

    public void print(){
        System.out.println(this);
    }

}

