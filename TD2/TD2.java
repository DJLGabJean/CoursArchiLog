package TD2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class TD2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }
    public static void ex1 () {
        int[] tab = {8,4,7,5,1};
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));
    }
    public static void ex2 () {
        String[] tab2 = {"banane","fraise","pomme","poire","abricot"};
        Arrays.sort(tab2);
        System.out.println(Arrays.toString(tab2));
    }
    public static void ex3 () {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tab3 = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Donner un prénom d'élève: ");
            String eleve = scanner.nextLine();
            tab3.add(eleve);
        }
        scanner.close();
        tab3.sort(null);
        System.out.println(tab3);
    }
}
