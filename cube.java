import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class cube {
    public static void main(String[] args) {
        String UserRoll;
        int result=0;

        System.out.println("Bitte geben sie die Anzahl der Wuerfel gefolgt von d und danach die Anzahl der Seiten ein! (z.b. 3d5)");
        Scanner in = new Scanner(System.in);

        UserRoll = in.nextLine();
        String[] input = UserRoll.split("d"); 
        String NumberofDice = input[0];
        String SizeofDice = input[1];
        
        int dicecounter = Integer.parseInt(NumberofDice);
        int dicesize = Integer.parseInt(SizeofDice);

        for (int counter=1; counter < dicecounter+1; counter++){
            int diceRoll = ThreadLocalRandom.current().nextInt(1, dicesize + 1);
            result = result + diceRoll;
            System.out.println("Wurf " + counter + " ergab: " + diceRoll);
        }
        System.out.println("Das Gesamtergebnis betraegt: " +result); 
        in.close();

    }
}