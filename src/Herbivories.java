public class Herbivories extends Mammals{
    private String pitFood;

    public Herbivories(String name, int years, String habidat, int travelSpeed, String pitFood) {
        super(name, years, habidat, travelSpeed);
        if (pitFood !=null && !pitFood.isEmpty() && !pitFood.isBlank()){
        this.pitFood = pitFood;
        }
    }

    public String getPitFood() {
        return pitFood;
    }

    public void setPitFood(String pitFood) {
        this.pitFood = pitFood;
    }
    public void toGraze(){

    }
    @Override
    public void toMove(){
        System.out.print("Herbivories like to muve on the Ground");
    }
    @Override
    public void toEat(){
        super.toEat();
        System.out.print("Vegetables");
    }
    @Override
    public String toString(){
        return "Name = "+ getName()+", Years = "+getYears()+", Habidat = "+getHabidat()+", travelSpeed = "+getTravelSpeed()+", PitFood = "+getPitFood();
    }

}
