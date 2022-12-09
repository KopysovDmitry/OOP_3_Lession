public class Main {
    public static void main(String[] args){

        Train martin = new Train(   "Ласточка",
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
        Train leningrad = new Train(   "Ленинград",
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

        Bus liaz = new Bus("Liaz","Skotovoz","Orange",1966,"Russia",220);
        Bus kamaz = new Bus("kamaz","112","Orange",1985,"Russia",300);
        Bus buhaz = new Bus("buhaz","01","red",1990,"Russia",400);
        Bus pazitron = new Bus("pazitron","ritual","black",2022,"Russia",1500);

        System.out.println("");
        liaz.info();
        kamaz.info();
        buhaz.info();
        pazitron.info();
    }
}