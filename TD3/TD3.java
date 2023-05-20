package TD3;
import java.util.Scanner;

public class TD3 {
    public static void main(String[] args) {
        ex4();
    }

    public static int ex1 (int num) {
        System.out.println("Le carré de " + num + " est " + num * num);
        return num * num;
    }
    
    public static int ex2 (int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Le premier nombre est plus grand");
            return num1;
        }
        else {
            System.out.println("Le deuxième nombre est plus grand");
            return num2;
        }
    }

    public static void ex3(int[] tab) {
        int num_m = 0;
        int num_a = 0;
        for (int i = 0; i < tab.length; i++) {
            num_m = tab[i];
            num_a += num_m;
        }
        System.out.println("La somme des nombres du tableau est " + num_a);
        return;
    }

    public static void ex4 () {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            afficherMenu();
            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.print("Donner un nombre: ");
                    int num1 = scanner.nextInt();
                    ex1(num1);
                    scanner.close();
                case 2:
                    System.out.print("Donner votre premier nombre: ");
                    num1 = scanner.nextInt();
                    System.out.print("Donner votre deuxieme nombre: ");
                    int num2 = scanner.nextInt();
                    ex2(num1, num2);
                    scanner.close();
                case 3:
                    while (true) {
                        System.out.print("Donner la taille du tableau: ");
                        int taille = scanner.nextInt();
                        int[] tab = new int[taille];
                        for (int i = 0; i < taille; i++) {
                            System.out.print("Donner un nombre: ");
                            num1 = scanner.nextInt();
                            tab[i] = num1;
                        }
                        ex3(tab);
                        scanner.close();
                    }
                case 4:
                    System.out.println("Sortie du programme.");
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez choisir une option valide.");
            }
        } while (choix != 4);
        scanner.close();
        return;
    }

    public static void afficherMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Calculer le carré d'un nombre");
        System.out.println("2. Savoir le nombre le plus grand entre deux nombres");
        System.out.println("3. Calculer la somme des nombres d'un tableau");
        System.out.println("4. Quitter");
        System.out.print("Choix : ");
    }
}
