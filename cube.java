import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class cube {
    public static void main(String[] args) {
        String UserRoll;
        int result=0;

        System.out.println("Bitte geben sie die Anzahl der Wuerfel gefolgt von d und danach die Anzahl der Seiten ein! (z.b. 3d5)");
        Scanner in = new Scanner(System.in);
        
        //User input 
        UserRoll = in.nextLine();
        
        //String split bei dem Buchstaben "d"
        String[] input = UserRoll.split("d"); 
        
        //umwandlung der Strings in integers
        int dicecounter = Integer.parseInt(input[0]);
        int dicesize = Integer.parseInt(input[1]);

        //generiert das Ergebnis anhand der vom user eingebenen Würfelzahl und Größe
        //anzahl der wiederholungen basierend auf der Anzahl der Würfel
        for (int counter=1; counter < dicecounter+1; counter++){
            int diceRoll = ThreadLocalRandom.current().nextInt(1, dicesize + 1);
            result = result + diceRoll;
            System.out.println("Wurf " + counter + " ergab: " + diceRoll);
        }
        System.out.println("Das Gesamtergebnis betraegt: " +result); 
        in.close();

    }
}