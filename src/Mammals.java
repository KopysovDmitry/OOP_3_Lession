public class Mammals extends Animals{

    private String habidat;

    private int travelSpeed;

    public String getHabidat() {
        return habidat;
    }

    public Mammals(String name, int years, String habidat, int travelSpeed) {
        super(name, years);
    }
    public void setHabidat(String habidat) {
        if (habidat != null && !habidat.isEmpty() && !habidat.isBlank()){
            this.habidat = habidat;
        }else {
            System.out.println("Default");
        }

    }

    public int getTravelSpeed() {
        return travelSpeed;
    }

    public void setTravelSpeed(int travelSpeed) {
        if (travelSpeed <0){
            System.out.println("speed is wrong");
        }
        this.travelSpeed = travelSpeed;
    }
    public void toWalk(){

    }
    @Override
    public void toEat(){
        System.out.println("Mammals like to eat: ");
    }
    @Override
    public void toMove(){
        System.out.println("Mammals like to muve: ");
    }
    @Override
    public void toSleep(){
        System.out.println("Mammals like to sleep in the night");
    }
}
