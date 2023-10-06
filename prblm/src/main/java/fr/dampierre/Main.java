package fr.dampierre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        {
            // Créer un objet Scanner pour lire les entrées de l'utilisateur
            Scanner sc = new Scanner(System.in);

            // Demander le revenu annuel de l'utilisateur
            System.out.println("Quel est votre revenu annuel ?");
            double revenu = sc.nextDouble();

            // Demander le nombre d'années de travail de l'utilisateur
            System.out.println("Depuis combien d'années travaillez-vous ?");
            int annees = sc.nextInt();

            // Fermer le Scanner
            sc.close();

            // Vérifier si l'utilisateur est éligible au prêt
            if (revenu > 30000 && annees >= 2) {
                // Afficher un message positif
                System.out.println("Félicitations, vous êtes éligible au prêt !");
            } else {
                // Afficher un message négatif
                System.out.println("Désolé, vous n'êtes pas éligible au prêt.");
            }
        }
    }
}
