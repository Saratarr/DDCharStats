import java.util.Arrays;
// import DDCharStats.Rolls;
import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // static public List<Rolls> roll;
    static Random rand = new Random();

    public static int rollAction() {
        int rollStats_1 = rand.nextInt(6);
        int rollStats_2 = rand.nextInt(6);
        int rollStats_3 = rand.nextInt(6);
        int rollStats_4 = rand.nextInt(6);

        int x = rollStats_1 + rollStats_2 + rollStats_3 + rollStats_4;

        return x;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // roll = new ArrayList<>();

        for (String s : Arrays.asList("\nStrength: ", "\nAgility: ",
                "\nIntelligence: ", "\nWisdom: ", "\nCharisma: ")) {
            System.out.println(s + rollAction()); // Factory Pattern
        }

        System.out.println("Happy adventuring!");
        // roll.add(Rolls());
        // roll.add(Rolls());
        // roll.add(Rolls());
        // roll.add(Rolls());
    }
}