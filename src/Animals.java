import java.time.LocalDate;
import java.util.Objects;

public abstract class Animals {

    private String name;

    private int years;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public Animals(String name, int years) {

        if (name !=null && !name.isBlank() && !name.isEmpty()){
            this.name = name;
        }else {
            System.out.println("Default");
        }
        if (years>=0){
            this.years= LocalDate.now().getYear() - years;
        } else {
            this.years = LocalDate.now().getYear() - Math.abs(years);
        }

    }

    public void setBirthYear(int birthYear) {
        this.years = years;
    }

    public abstract void toEat();


    public abstract void toSleep();


    public abstract void toMove();

    public void getInfo(){
        System.out.println(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals)) return false;
        Animals animals = (Animals) o;
        return getYears() == animals.getYears() && getName().equals(animals.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYears());
    }
}





