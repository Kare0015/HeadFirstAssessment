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
        System.out.println();



    }

}
