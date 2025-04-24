//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BibliotekaMuzyczna mojaBiblioteka = new BibliotekaMuzyczna("Kolekcja Rockowa", "Jan Kowalski");

        mojaBiblioteka.dodajUtwor("Led Zeppelin - Stairway to Heaven");
        mojaBiblioteka.dodajUtwor("Queen - Bohemian Rhapsody");
        mojaBiblioteka.dodajUtwor("Pink Floyd - Comfortably Numb");
        mojaBiblioteka.dodajUtwor("AC/DC - Back in Black");
        mojaBiblioteka.dodajUtwor("Metallica - Nothing Else Matters");

        mojaBiblioteka.wyswietlUtwory();

        mojaBiblioteka.utworzPlayliste("Ulubione");
        mojaBiblioteka.utworzPlayliste("Na imprezę");

        mojaBiblioteka.dodajUtworDoPlaylisty("Queen - Bohemian Rhapsody", "Ulubione");
        mojaBiblioteka.dodajUtworDoPlaylisty("Pink Floyd - Comfortably Numb", "Ulubione");
        mojaBiblioteka.dodajUtworDoPlaylisty("AC/DC - Back in Black", "Na imprezę");
        mojaBiblioteka.dodajUtworDoPlaylisty("Metallica - Nothing Else Matters", "Na imprezę");

        mojaBiblioteka.wyswietlWszystkiePlaylisty();
        mojaBiblioteka.wyswietlPlayliste("Ulubione");

        mojaBiblioteka.wyszukajUtwory("Queen");

        mojaBiblioteka.usunUtwor("AC/DC - Back in Black");

        mojaBiblioteka.wyswietlPlayliste("Na imprezę");

        System.out.println("Łączna liczba utworów w bibliotece: " + mojaBiblioteka.getLiczbaUtworow());
        System.out.println("Łączna liczba playlist: " + mojaBiblioteka.getLiczbaPlaylist());
    }
}