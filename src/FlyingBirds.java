import java.util.Objects;

public class FlyingBirds extends Birds{
    private String movementTipe;

    public FlyingBirds(String name, int years, String habidat, String movementTipe) {
        super(name, years, habidat);
        if (movementTipe != null && !movementTipe.isEmpty() && !movementTipe.isBlank()){
            this.movementTipe = movementTipe;
        }else {
            System.out.println("Wrong data");
        }
    }

    public String getMovementTipe() {
        return movementTipe;
    }

    public void setMovementTipe(String movementTipe) {
        this.movementTipe = movementTipe;
    }
    public void toFly(){

    }
    @Override
    public void toEat(){
        System.out.print("Birds like insects");
    }
    @Override
    public void toMove(){
        System.out.println("Birds is flying");
    }
    @Override
    public void toSleep(){
        System.out.println("Birds sleeping in the night");
    }

    @Override
    public String toString(){
        return "Name = "+ getName()+", Years = "+getYears()+", Habidat = "+getHabidat()+", movementTipe = "+getMovementTipe();
    }


}
