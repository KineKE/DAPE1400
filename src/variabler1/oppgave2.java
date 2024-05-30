/*
Oppgave 1:
Lag et program som leser inn en persons fornavn og etternavn hver for seg (altså i to forskjellige input-bokser),
skjøter dem sammen, og skriver det fullstendige navnet ut igjen som del av en passende tekst i en meldingsboks.
Bruk passende ledetekster ved innlesing, slik at brukeren forstår hva som skal skrives inn.
 */

/*
Oppgave 2:
Utvid oppgave 1 med å lese inn alderen. Programmet skal så vise følgende i meldingsboksen(f.eks inndata):
"Alderen til Ole Olesen er 21 år".
 */

package variabler1;

import javax.swing.*;

public class oppgave2 {
    public static void main(String[] args) {
        // Lager variabler
        boolean validInput = false;

        String innFornavn = null;
        String innEtternavn = null;
        String innAlder = null;
        String konkatNavn = null;

        // Henter fornavn
        while (innFornavn == null || innFornavn.trim().isEmpty() || !innFornavn.matches("[a-zA-Z]+")) {
            innFornavn = JOptionPane.showInputDialog("Hei! Hva er fornavnet ditt?");
            if (innFornavn == null || innFornavn.trim().isEmpty() || !innFornavn.matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(
                        null,
                        "Vennligst skriv inn et gyldig fornavn som kun inneholder bokstaver.",
                        "Ugyldig input",
                        JOptionPane.ERROR_MESSAGE);
            }
        }




        // Henter input inn i variabler
        // Henter fornavn
        //innFornavn = JOptionPane.showInputDialog("Hei! Hva er fornavnet ditt?");

        // Henter etternavn
        innEtternavn = JOptionPane.showInputDialog("Hva heter du til etternavn?");

        // Henter alder
        innAlder = JOptionPane.showInputDialog("Hvor gammel er du (antall hele år)?");

        // Bedre lesbarhet å konkatinere før meldingsboksen
        konkatNavn = innFornavn + " " + innEtternavn;

        JOptionPane.showMessageDialog(null,
                "Alderen til " + konkatNavn + " er " + innAlder + " år.");
    }
}

