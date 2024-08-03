import java.util.List;
import java.util.ArrayList;
import DDCharStats.Rolls;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static public List<Rolls> roll;

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        roll = new ArrayList<>();

        System.out.println("Strength: "); // Factory Pattern
        roll.add(Rolls());
        System.out.println("Agility: ");
        roll.add(Rolls());
        System.out.println("Intelligence: ");
        roll.add(Rolls());
        System.out.println("Wisdom: ");
        roll.add(Rolls());
        System.out.println("Charisma: ");
        roll.add(Rolls());
    }
}