import java.util.*;

public class DoPracticeWhile {
    public static void main(String[] args) {
        int students = 0;
        int mark = 0;
        int distinctions = 0;
        int passes = 0;
        int fails = 0;
        int invalids = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Input a mark: ");
            mark = Integer.parseInt(sc.next());
            if (mark < -1 || mark > 100) {
                invalids++;
            } else if (mark >= 70) {
                distinctions++;
                students++;
            } else if (mark >= 50) {
                passes++;
                students++;
            } else if (mark != -1) {
                fails++;
                students++;
            }
        } while (mark != -1);
        
        System.out.println("There are " + students + " students: " + distinctions + " distinctions, "
                                        + passes + " passes, " + fails + " fails (plus " + invalids + " invalid).");
    }
}