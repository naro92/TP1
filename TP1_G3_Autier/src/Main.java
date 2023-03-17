import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Création de l'objet scanner pour lire les entrées
        int unEntier = scanner.nextInt(); // Scanne et attend un entier
        float unReel = scanner.nextFloat(); // Scanne et attend un réel
        System.out.println("Quel est votre prénom ?");
        String prenom = scanner.next(); // Scanne et attend un String (le prénom)
        System.out.println("J’ai recupere un entier: " + unEntier); // Affiche l'entier dans un message
        System.out.println("J’ai aussi recupere un reel: " + unReel); // Affiche le réel dans un message
        System.out.println("Bonjour, " + prenom); // Affiche le prénom dans un message
        somme();
        division();
        volume();
    }

    public static void somme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + somme);
    }

    public static void division() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = scanner.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scanner.nextInt();
        float division = (float) premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + division);
    }

    public static void volume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la longueur en cm de votre pavé droit ?");
        int longueur = scanner.nextInt();
        System.out.println("Quelle est la largeur en cm de votre pavé droit ?");
        int largeur = scanner.nextInt();
        System.out.println("Quelle est la hauteur en cm de votre pavé droit ?");
        int hauteur = scanner.nextInt();
        int volume = longueur*largeur*hauteur;
        System.out.println("Le volume du pavé droit est de " + volume + " cm3.");

    }
}
