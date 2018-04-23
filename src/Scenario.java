public class Scenario {
    public static void main(String[] args) {
        TweedeklasReiziger dyon = new TweedeklasReiziger("Dyon");
        TweedeklasReiziger bas = new TweedeklasReiziger("Bas");
        TweedeklasReiziger henk = new TweedeklasReiziger("Henk");
        TweedeklasReiziger arjen = new TweedeklasReiziger("Arjen");
        TweedeklasReiziger jesper = new TweedeklasReiziger("Jesper");
        EersteklasReiziger andries = new EersteklasReiziger("Andries");
        Zwartrijder joery = new Zwartrijder("Joery");

        Trein trein = new Trein();

        System.out.println("De trein vertrekt vanaf het rangeerterrein naar Goes.");
        System.out.println(trein);
        System.out.println();

        System.out.println("De trein komt aan op station goes en de deuren gaan open.");
        trein.instappen(henk, dyon, bas, arjen, jesper, andries, joery);
        System.out.println(trein);
        System.out.println("De trein rijdt weer verder");
        System.out.println();

        System.out.println("De trein komt aan op station Arnemuiden en de deuren gaan open.");
        TweedeklasReiziger franka = new TweedeklasReiziger("Franka");
        TweedeklasReiziger nicole = new TweedeklasReiziger("Nicole");
        trein.instappen(franka, nicole);
        System.out.println("De trein rijdt weer verder.");
        System.out.println();

        System.out.println("De trein komt aan op station Middelburg en de deuren gaan open.");
        EersteklasReiziger joop = new EersteklasReiziger("Joop");
        trein.instappen(joop);
        Reiziger uitgestapte = trein.uitstappen("Joery");
        trein.uitstappen("Joery");
        System.out.println("De trein rijdt weer verder");
        System.out.println();

        System.out.println("De trein komt aan op eindstation Vlissingen en de deuren gaan open.");
//        Reiziger uitgestapte = trein.uitstappen("Dyon");
//        Reiziger uitgestapte = trein.uitstappen("Bas");
//        Reiziger uitgestapte = trein.uitstappen("Henk");
//        Reiziger uitgestapte = trein.uitstappen("Arjen");
//        Reiziger uitgestapte = trein.uitstappen("Jesper");
//        Reiziger uitgestapte = trein.uitstappen("Andries");
//        Reiziger uitgestapte = trein.uitstappen("Franka");
//        Reiziger uitgestapte = trein.uitstappen("Nicole");
//        Reiziger uitgestapte = trein.uitstappen("Joop");
//        trein.uitstappen("Dyon", "Bas", "Henk", "Arjen", "Jesper", "Andries", "Franka", "Nicole", "Joop");
        trein.uitstappen("Dyon");
        trein.uitstappen("Bas");
        trein.uitstappen("Henk");
        trein.uitstappen("Arjen");
        trein.uitstappen("Jesper");
        trein.uitstappen("Andries");
        trein.uitstappen("Franka");
        trein.uitstappen("Nicole");
        trein.uitstappen("Joop");
        System.out.println("De machinist zet de motor van de trein uit en gaat naar huis");
        System.out.println();


    }

}
