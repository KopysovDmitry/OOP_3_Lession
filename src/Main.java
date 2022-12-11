import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Train martin = new Train("Ласточка",
                "B-901",
                "",
                2011,
                "Россия",
                301,
                3500,
                "",
                "Белорусский вокзал",
                "Минск-пассажирский",
                11
        );
        Train leningrad = new Train("Ленинград",
                "B-125",
                "",
                2019,
                "Россия",
                270,
                1700,
                "",
                "Ленинградский вокзал",
                "Ленинград-пассажирский",
                8
        );
        martin.trainInfo();
        System.out.println("");
        leningrad.trainInfo();

        Bus liaz = new Bus("Liaz", "Skotovoz", "Orange", 1966, "Russia", 220);
        Bus kamaz = new Bus("kamaz", "112", "Orange", 1985, "Russia", 300);
        Bus buhaz = new Bus("buhaz", "01", "red", 1990, "Russia", 400);
        Bus pazitron = new Bus("pazitron", "ritual", "black", 2022, "Russia", 1500);

        System.out.println("");
        liaz.info();
        kamaz.info();
        buhaz.info();
        pazitron.info();

        System.out.println("");
        System.out.println("");


        Herbivories gazel = new Herbivories("gazel", 2005, "savana", 150, "grass");
        gazel.getInfo();
        Herbivories giraffe = new Herbivories("giraffe", 2010, "savana", 30, "grass");
        giraffe.getInfo();
        Herbivories horse = new Herbivories("horse", 2020, "everyWere", 60, "grass");
        horse.getInfo();
        Predators hiena = new Predators("hiena", 2022, "savana", 30, "meat");
        hiena.getInfo();
        Predators tiger = new Predators("tiger", 2008, "jungle", 60, "meat");
        tiger.getInfo();
        Predators bear = new Predators("bear", 2018, "forest", 60, "all");
        bear.getInfo();
        Amphibians frog = new Amphibians("frog", 2022, "swamp");
        frog.getInfo();
        Amphibians snake = new Amphibians("snake", 2022, "everywere");
        snake.getInfo();
        NotFlyingBirds peacock = new NotFlyingBirds("peacok", 2021, "parks", "running");
        peacock.getInfo();
        NotFlyingBirds penguin = new NotFlyingBirds("penguin", 2022, "antarctida", "swiming");
        penguin.getInfo();
        NotFlyingBirds dodo = new NotFlyingBirds("dodo", 2020, "jungle", "running");
        dodo.getInfo();
        FlyingBirds gull = new FlyingBirds("gull", 2022, "sea", "flying");
        gull.getInfo();
        FlyingBirds albatros = new FlyingBirds("albatros", 2022, "sea", "flying");
        albatros.getInfo();
        FlyingBirds falcen = new FlyingBirds("falcen", 2022, "forest", "flying");
        falcen.getInfo();



    }

}