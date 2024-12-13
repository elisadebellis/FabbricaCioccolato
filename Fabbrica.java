import java.util.ArrayList;

public class Fabbrica {

    ArrayList<Cioccolato> cioccolata = new ArrayList<Cioccolato>();

    public void resoconto() {

        for (Cioccolato c : cioccolata) {
            System.out.println(c.toString());
        }
    }

    public static void main(String[] args) {

        Fabbrica fabbrica = new Fabbrica();

        fabbrica.cioccolata.add(new CioccolatoCaldo("fondente", "nocciole",20, 25, 5, 25));
        fabbrica.cioccolata.add(new Cioccolatini("fondente", "mandorle",40, "rotondi", "amarene"));
        fabbrica.cioccolata.add(new TavolettaCioccolato("al latte", "biscotti",60, 15, false));

        for (Cioccolato c : fabbrica.cioccolata) {

            c.produce();

        }

        fabbrica.resoconto();

    }

}
