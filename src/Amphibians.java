public class Amphibians extends Animals{

    private String habidat;

    public Amphibians(String name, int years, String habidat) {
        super(name, years);
        if (habidat != null && !habidat.isEmpty() && !habidat.isBlank()){
            this.habidat = habidat;
        }else {
            System.out.println("Default");
        }
    }

    public String getHabidat() {
        return habidat;
    }

    public void setHabidat(String habidat) {
        this.habidat = habidat;
    }
    public void toHunting(){

    }

    @Override
    public void toEat(){
        System.out.println("Amphibians eat insects");
    }
    @Override
    public void toMove(){
        System.out.println("amphibians crawling");
    }
    @Override
    public void toSleep(){
        System.out.println("amphibians is never sleep");
    }
    @Override
    public String toString(){
        return "Name = "+ getName()+", Years = "+getYears()+", Habidat = "+getHabidat();
    }
}
