package structures.Zad1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Osoba implements Comparable<Osoba> {
    private String Imię;
    private String Nazwisko;
    private int wiek;

    public int compareTo( Osoba osoba){
        return Integer.compare(wiek, osoba.getWiek());
    }

}


