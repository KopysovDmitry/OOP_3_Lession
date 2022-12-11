public class Bus extends Transport{


    public Bus(String brand, String model, String colour, int year, String country, int maxSpeed) {
        super(brand, model, colour, year, country, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("я заправляюсь дизелем");
    }

}
