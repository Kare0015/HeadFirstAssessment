import java.util.HashMap;

public class Trein {
    private HashMap<String, Reiziger> stoelen = new HashMap<>();

    public void instappen (Reiziger reiziger1, Reiziger reiziger2, Reiziger reiziger3, Reiziger reiziger4, Reiziger reiziger5, Reiziger reiziger6, Reiziger reiziger7) {
        instappen(reiziger1);
        instappen(reiziger2);
        instappen(reiziger3);
        instappen(reiziger4);
        instappen(reiziger5);
        instappen(reiziger6);
        instappen(reiziger7);
    }

    public void instappen(Reiziger reiziger) {

        String key = reiziger.getName();
        Reiziger value = reiziger;
        this.stoelen.put(key, value);
        showInfo(reiziger, "is ingestapt");
    }

    private void showInfo(Reiziger reiziger, String actie) {System.out.println(reiziger.getName() + actie); }

    public Reiziger uitstappen(String name) {

        if (!stoelen.containsKey(name)) {
            System.out.println(name + " zit niet in de bus.");
            return null;
        }

        Reiziger uitgestapte = stoelen.get(name);
        stoelen.remove(name);
        showInfo(uitgestapte, " is uitgestapt.");
        return uitgestapte;

    }

    private int getReizigersCount() { return stoelen.size(); }

    public String toString() { return "Er zitten " +getReizigersCount()+" mensen in de trein"; }
}
