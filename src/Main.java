import java.util.Arrays;
// import DDCharStats.Rolls;
import java.util.Random;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Random rand = new Random();
    static Scanner s = new Scanner(System.in);
    static boolean reroll = false;

    public static int rollAction() {
        int rollStats_1 = rand.nextInt(6) + 1;
        int rollStats_2 = rand.nextInt(6) + 1;
        int rollStats_3 = rand.nextInt(6) + 1;
        int rollStats_4 = rand.nextInt(6) + 1;

        int x = rollStats_1 + rollStats_2 + rollStats_3 + rollStats_4;
        int y = 0;

        if (x <= 6) {
            y = x + 4;
            return y;
        } else { return x; }
    }

    public static void rollPost() {
        for (String s : Arrays.asList("Strength: ", "Agility: ",
                "Intelligence: ", "Wisdom: ", "Charisma: ")) {
            System.out.println(s + rollAction());
        }
    }

    public static void main(String[] args) {
        System.out.println("Adventurer, what is your name?");
        String userName = s.nextLine();
        System.out.println("\n-=" + userName + "=-");
        rollPost();

        System.out.println("\nRoll again? Y/N"); // How to loop? Is it possible without another class level object?
        String rollAgain = s.nextLine();
        if (rollAgain.equals("Y")) {
            reroll = true;
            while (reroll == true) {
                System.out.println("\n-=" + userName + "=-");
                rollAction();
                rollPost();
                System.out.println("\nRoll again? Y/N");
                rollAgain = s.nextLine();
                if (!rollAgain.equals("Y")) {
                    reroll = false;
                    break;
                }
            }
        }
        System.out.println("\n***Happy adventuring! Come again***");
    }
}