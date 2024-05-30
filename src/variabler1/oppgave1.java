/*
Oppgavetekst:
Lag et program som leser inn en persons fornavn og etternavn hver for seg (altså i to forskjellige input-bokser),
skjøter dem sammen, og skriver det fullstendige navnet ut igjen som del av en passende tekst i en meldingsboks.
Bruk passende ledetekster ved innlesing, slik at brukeren forstår hva som skal skrives inn.
 */

package variabler1;

import javax.swing.*;

public class oppgave1 {
    public static void main(String[] args) {
        // Henter input inn i variabler
        String innFornavn = JOptionPane.showInputDialog("Hei! Hva er fornavnet ditt?");
        String innEtternavn = JOptionPane.showInputDialog("Supert. Hva heter du til etternavn?");

        // Bedre lesbarhet å konkatinere før meldingsboksen
        String konkatNavn = innFornavn + " " + innEtternavn;

        JOptionPane.showMessageDialog(null, "Hei på deg " + konkatNavn + "!");
    }
}
