import java.util.Objects;

public class Birds extends Animals{
    private String habidat;

    public Birds(String name, int years, String habidat) {
        super(name, years);
    }

    public String getHabidat() {
        return habidat;
    }

    public void setHabidat(String habidat) {
        if (habidat != null && !habidat.isEmpty() && !habidat.isBlank()){
            this.habidat = habidat;
        }else {
            System.out.println("Default");
        }
    }
    public void toHunting(){

    }
    @Override
    public void toEat(){
        System.out.print("Birds like insects");
    }
    @Override
    public void toMove(){
        System.out.println("Birds is running and flying");
    }
    @Override
    public void toSleep(){
        System.out.println("Birds sleeping in the night");
    }


}
