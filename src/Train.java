
public class Train extends Transport{

    private int costRide;
    private String timeRide;
    private String nameStation;
    private String finalStation;
    private int amountWagons;

    public Train(String brand, String model, String colour, int year, String country, int maxSpeed,
                 int costRide, String timeRide, String nameStation, String finalStation, int amountWagons) {
        super(brand, model, colour, year, country, maxSpeed);
        this.costRide = costRide;
        this.timeRide = timeRide;
        this.nameStation = nameStation;
        this.finalStation = finalStation;
        this.amountWagons = amountWagons;
    }



    public int getCostRide() {
        return costRide;
    }

    public void setCostRide(int costRide) {
        this.costRide = costRide;
    }

    public String getTimeRide() {
        return timeRide;
    }

    public void setTimeRide(String timeRide) {
        this.timeRide = timeRide;
    }

    public String getNameStation() {
        return nameStation;
    }

    public void setNameStation(String nameStation) {
        this.nameStation = nameStation;
    }

    public String getFinalStation() {
        return finalStation;
    }

    public void setFinalStation(String finalStation) {
        this.finalStation = finalStation;
    }

    public int getAmountWagons() {
        return amountWagons;
    }

    public void setAmountWagons(int amountWagons) {
        this.amountWagons = amountWagons;
    }

    @Override
    public void refill() {
        System.out.println("я заправляюсь дизелем");
    }


    public void trainInfo() {
        System.out.println(this +", biletCoste "+ costRide +", timeRide "+ timeRide +", nameStation "+ nameStation +
                ", finalStation "+ finalStation +", amountWagons "+ amountWagons);
    }
}
