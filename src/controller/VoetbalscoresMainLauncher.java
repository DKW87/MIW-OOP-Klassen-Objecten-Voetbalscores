package Controller;

import Model.Wedstrijd;

import java.util.Scanner;

public class VoetbalscoresMainLauncher {

    public static void main(String[] args) {

        // variabelen
        Scanner userInput = new Scanner(System.in);

        Wedstrijd eersteWedstrijd = new Wedstrijd("PEC", 5, 0);
        eersteWedstrijd.printUitslag();
        eersteWedstrijd.printWedstrijdPunten();

        Wedstrijd tweedeWedstrijd = new Wedstrijd();
        System.out.print("\nWie is de tegenstander? ");
        tweedeWedstrijd.naamTegenstander = userInput.nextLine();
        System.out.print("Doelpunten gescoord: ");
        tweedeWedstrijd.voorDoelpunten = userInput.nextInt();
        System.out.print("Doelpunten tegenstander: ");
        tweedeWedstrijd.tegenDoelpunten = userInput.nextInt();
        tweedeWedstrijd.printUitslag();
        tweedeWedstrijd.printWedstrijdPunten();


    }

}
