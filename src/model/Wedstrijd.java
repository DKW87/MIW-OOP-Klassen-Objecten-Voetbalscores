package Model;

public class Wedstrijd {

    public String naamTegenstander;
    public int voorDoelpunten;
    public int tegenDoelpunten;

    public Wedstrijd(String naamTegenstander, int voorDoelpunten, int tegenDoelpunten) {

        this.naamTegenstander = naamTegenstander;
        this.voorDoelpunten = voorDoelpunten;
        this.tegenDoelpunten = tegenDoelpunten;

    }

    public Wedstrijd(String naamTegenstander) {

        this.naamTegenstander = naamTegenstander;
        this.voorDoelpunten = 0;
        this.tegenDoelpunten = 0;

    }

    public Wedstrijd() {

        this.naamTegenstander = "Onbekend";
        this.voorDoelpunten = 0;
        this.tegenDoelpunten = 0;
    }

    public int bepaalWedstrijdPunten(){
        int aantalPunten = 0;
        final int VERLIES = 0;
        final int GELIJKSPEL = 1;
        final int WINST = 3;

        if (this.tegenDoelpunten > this.voorDoelpunten){
            aantalPunten = VERLIES;
        }
        else if (this.voorDoelpunten > this.tegenDoelpunten) {
            aantalPunten = WINST;
        }
        else {
            aantalPunten = GELIJKSPEL;
        }

        return aantalPunten;
    }

    public void printUitslag(){
        System.out.printf("Uitslag van de wedstrijd tegen %s: %d-%d %n", this.naamTegenstander,this.voorDoelpunten,this.tegenDoelpunten);
    }

    public void printWedstrijdPunten() {
        System.out.printf("Dit levert %d wedstrijdpunten op. %n", this.bepaalWedstrijdPunten());
    }

}
