

import java.util.ArrayList;

class BibliotekaMuzyczna {
    private String nazwa;
    private String wlasciciel;
    private ArrayList<String> utwory;
    private ArrayList<Playlista> playlisty;

    public BibliotekaMuzyczna(String nazwa, String wlasciciel) {
        this.nazwa = nazwa;
        this.wlasciciel = wlasciciel;
        this.utwory = new ArrayList<>();
        this.playlisty = new ArrayList<>();
    }

    public void dodajUtwor(String utwor) {
        if (!utwory.contains(utwor)) {
            utwory.add(utwor);
        }
    }

    public void usunUtwor(String utwor) {
        if (utwory.remove(utwor)) {
            for (Playlista playlista : playlisty) {
                playlista.usunUtwor(utwor);
            }
        }
    }

    public void wyswietlUtwory() {
        System.out.println("Utwory w bibliotece:");
        for (String utwor : utwory) {
            System.out.println("- " + utwor);
        }
    }

    public void wyszukajUtwory(String fraza) {
        System.out.println("Wyniki wyszukiwania dla frazy: " + fraza);
        for (String utwor : utwory) {
            if (utwor.toLowerCase().contains(fraza.toLowerCase())) {
                System.out.println("- " + utwor);
            }
        }
    }

    public void utworzPlayliste(String nazwa) {
        if (znajdzPlayliste(nazwa) == null) {
            playlisty.add(new Playlista(nazwa));
        }
    }

    private Playlista znajdzPlayliste(String nazwa) {
        for (Playlista x:playlisty) {
            if (x.getNazwa().equalsIgnoreCase(nazwa)) {
                return x;
            }
        }
        return null;
    }

    public void dodajUtworDoPlaylisty(String utwor, String nazwaPlaylisty) {
        Playlista playlista = znajdzPlayliste(nazwaPlaylisty);
        if (playlista != null&&utwory.contains(utwor)) {
            playlista.dodajUtwor(utwor);
        }
    }

    public void wyswietlPlayliste(String nazwa) {
        Playlista playlista = znajdzPlayliste(nazwa);
        if (playlista != null) {
            playlista.wyswietl();
        } else {
            System.out.println("Playlista " + nazwa + " nie istnieje.");
        }
    }

    public void wyswietlWszystkiePlaylisty() {
        System.out.println("Wszystkie playlisty:");
        for (Playlista playlista : playlisty) {
            System.out.println("- " + playlista.getNazwa());
        }
    }

    public int getLiczbaUtworow() {
        return utwory.size();
    }

    public int getLiczbaPlaylist() {
        return playlisty.size();
    }
}
