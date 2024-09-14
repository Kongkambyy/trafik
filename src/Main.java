import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Bruger input

        System.out.println("Indtast tid på dagen (dag, aften, nat): ");
        String tidPåDagen = scanner.nextLine().toLowerCase();

        System.out.println("Indtast trafikmængde (høj, lav): ");
        String trafikMængde = scanner.nextLine().toLowerCase();

        System.out.println("Indtast områdets type (bolig, erhverv, blandet): ");
        String områdeType = scanner.nextLine().toLowerCase();

        System.out.println("Er der en nødsituation? (ja/nej): ");
        String nødsituation = scanner.nextLine().toLowerCase();

        String trafiklysFarve;
        String adgang;

        //Her gennemgår vi samtlige forskellige kombinationer af scenarier med if og else-if statements

        if (nødsituation.equals("ja")) {
            trafiklysFarve = "Grønt";
        } else if (tidPåDagen.equals("dag") && trafikMængde.equals("lav")) {
            trafiklysFarve = "Grønt";
        } else if (tidPåDagen.equals("aften")) {
            trafiklysFarve = "Gult";
        } else if (tidPåDagen.equals("nat") && trafikMængde.equals("lav")) {
            trafiklysFarve = "Gult";
        } else if (tidPåDagen.equals("nat") && trafikMængde.equals("høj")) {
            trafiklysFarve = "Rødt";
        } else if (områdeType.equals("bolig") && trafikMængde.equals("høj")) {
            trafiklysFarve = "Rødt";
        } else {
            trafiklysFarve = "Rødt";
        }

        //Adgang til området

        if (områdeType.equals("erhverv")) {
            adgang = "Tilladt";
        } else if (områdeType.equals("blandet") && trafikMængde.equals("lav")) {
            adgang = "Tilladt";
        } else if (områdeType.equals("bolig") && tidPåDagen.equals("nat")) {
            adgang = "Forbudt";
        } else {
            adgang = "Forbudt";
        }

        System.out.println("Trafiklysfarve: " + trafiklysFarve);
        System.out.println("Adgang til området: " + adgang);
    }
}
