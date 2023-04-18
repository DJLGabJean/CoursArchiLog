import java.util.Scanner;


// Exercice 1

// class TD1 {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");
//     }
// }


// Exercice 2

// class TD1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Quel est vote nom? ");
//         String name = scanner.nextLine();

//         System.out.println("Bienvenue dans la programme main " + name + "!");
//         scanner.close();   
//     }
// }


// Exercice 3

// class TD1 {
//     public static void main (String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Donner votre premier nombre: ");
//         String num1 = scanner.nextLine();
//         System.out.print("Donner votre deuxieme nombre: ");
//         String num2 = scanner.nextLine();

//         // (a + b + |a - b|) / 2
//         System.out.println("Le maximum entre vos deux nombres est " + Math.max(Integer.parseInt(num1), Integer.parseInt(num2))); 
//         scanner.close();
//     }
// }


// Exercice 4

// class TD1 {
//     public static void main (String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Donner un nombre: ");
//         String num1 = scanner.nextLine();

//         if (Integer.parseInt(num1) % 2 == 0){
//             System.out.println("Votre nombre est pair");
//         }
//         else {
//             System.out.println("Votre nombre est impair");
//         }
//         scanner.close();
//     }
// }

// Exercice 5

// class TD1 {
//     public static void main (String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Donner votre premier nombre: ");
//         int num1 = scanner.nextInt();
//         System.out.print("Donner votre deuxieme nombre: ");
//         int num2 = scanner.nextInt();

//         int temp = num1;
//         num1 = num2;
//         num2 = temp;

//         System.out.println("Après un échange, votre premier nombre est : " + num1);
//         System.out.println("Après un échange, votre deuxième nombre est : " + num2);
//         scanner.close();
//     }
// }

// Exercice 6

// class TD1 {
//     public static void main (String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Donner un nombre: ");
//         int n = scanner.nextInt();
//         int result = 0;

//         for (int i = 1; i <= 5; i++){
//             result = n * i;
//         }
//         System.out.println("Votre nombre après 5 incréments est : " + result);
//         scanner.close();
//     }
// }

// Exercice 7

// class TD1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Entrez un entier positif: ");
//         int n = scanner.nextInt();
//         int i = 1;
//         int resultat = 1;
        
//         while (i <= n) {
//             resultat *= i;
//             i++;
//         }

//         System.out.println("La factorielle de " + n + " est " + resultat);
//         scanner.close();
//     }
// }

// Exercice 8

// class TD1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Entrez une durée en minutes : ");
//         int n = scanner.nextInt();
//         int heures = n / 60;
//         int minutes = n % 60;

//         System.out.println("La durée est de " + heures + " heures et " + minutes + " minutes");
//         scanner.close();
//     }
// }