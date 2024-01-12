package entites;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Set<String> specialite = new HashSet<>();
        specialite.add("JAVA");
        specialite.add("PHP");
        specialite.add("C#");

        List<Personne> listP = new ArrayList<>();
        int N;
        do {
            System.out.println("Donner le nombre d'etudiants");
            N = scan.nextInt();
        }while (N <= 0);
        System.out.println("Remplissage du tableau d'etudiants et de Professeurs");
        for (int i = 0; i < N; i++) {
            System.out.println("Etudiant : " + (i+1));
            Etudiant etudiant = new Etudiant();
            Professeur professeur = new Professeur();
            etudiant.saisieEtu();
            listP.add(etudiant);

            System.out.println("Professeur : " + (i+1));
            professeur.saisieProf();
            listP.add(professeur);

        }
        for (Personne p: listP) {
            System.out.println(p.toString());
        }
    }

}