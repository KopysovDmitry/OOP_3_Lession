public class Predators extends Mammals{
    private String pitFood;

    public Predators(String name, int years, String habidat, int travelSpeed, String pitFood) {
        super(name, years, habidat, travelSpeed);
    }

    public String getPitFood() {
        return pitFood;
    }

    public void setPitFood(String pitFood) {
        if (pitFood !=null && !pitFood.isEmpty() && !pitFood.isBlank()){
            this.pitFood = pitFood;
        }
    }
    public void toHunting(){

    }
    @Override
    public void toEat(){
        super.toEat();
        System.out.print("meat");
    }
    @Override
    public void toMove(){
        System.out.println("Predators is runing");
    }
    @Override
    public void toSleep(){
        System.out.println("predators sleeping in the day time");
    }
    @Override
    public String toString(){
        return "Name = "+ getName()+", Years = "+getYears()+", Habidat = "+getHabidat()+", travelSpeed = "+getTravelSpeed()+", PitFood = "+getPitFood();
    }

}
