package entites;

import dao.IEtudiant;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Etudiant extends Personne implements IEtudiant {
    private int id;
    private String numEtudiant;

    @Override
    public void sinscrire() {

    }

    @Override
    public void suivrCours() {

    }

    @Override
    public void passerExamen() {

    }

    public enum Classe {
        L3,
        M1,
        M2
    }

    private Classe classe;
    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, LocalDate dateNaiss, String numEtudiant, String classe, int id) {
        super(nom, prenom, dateNaiss);
        this.numEtudiant = numEtudiant();
        this.classe = Classe.valueOf(classe);
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNumEtudiant() {
        return numEtudiant;
    }

    public void setNumEtudiant(String numEtudiant) {
        this.numEtudiant = numEtudiant;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = Classe.valueOf(classe);
    }
    public int calculage(){
        LocalDate currentDate = LocalDate.now();
        Period annee = Period.between(getDateNaiss(), currentDate);
        int age = annee.getYears();
        return age;
    }
    public String numEtudiant (){
        String num = (nom + nom.length() + calculage()+ id);
        return num;
    }

    @Override
    public String toString() {
        return "entites.Etudiant{" +
                    "id=" + id +
                    ", numEtudiant='" + numEtudiant() + '\'' +
                    ", classe='" + classe + '\'' +
                    ", nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", DateNaiss=" + DateNaiss ;
    }

    public void saisieEtu(){
        saisie();
        Scanner scan = new Scanner(System.in);
        System.out.println("Donner la classe: ");
        classe = Classe.valueOf(scan.nextLine());
        System.out.println("Donner le l'Id: ");
        id = scan.nextInt();

    }


}
