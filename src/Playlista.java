import java.util.ArrayList;

class Playlista {
    private String nazwa;
    private ArrayList<String> utwory;

    public Playlista(String nazwa) {
        this.nazwa = nazwa;
        this.utwory = new ArrayList<>();
    }

    public String getNazwa() {
        return nazwa;
    }

    public ArrayList<String> getUtwory() {
        return utwory;
    }

    public void dodajUtwor(String utwor) {
        if (!utwory.contains(utwor)) {
            utwory.add(utwor);
        }
    }

    public void usunUtwor(String utwor) {
        utwory.remove(utwor);
    }

    public void wyswietl() {
        System.out.println("Playlista: " + nazwa);
        for (String utwor : utwory) {
            System.out.println(" - " + utwor);
        }
    }
}
