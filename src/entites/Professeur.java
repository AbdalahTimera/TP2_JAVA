package entites;

import dao.IProfesseur;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;

public class Professeur extends Personne implements IProfesseur {
     Set<String> specialite;

    public Professeur() {
    }

    public Professeur(String nom, String prenom, LocalDate dateNaiss, Set<String> specialite) {
        super(nom, prenom, dateNaiss);
        this.specialite = specialite;
    }

    public Set<String> getSpecialite() {
        return specialite;
    }

    public void setSpecialite(Set<String> specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "entites.Professeur{" +
                "specialite=" + specialite +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", DateNaiss=" + DateNaiss ;
    }
    public void ajoutSpecialite(String spe){
        specialite.add(spe);
    }
    public void saisieProf(){
        saisie();
        Scanner scan = new Scanner(System.in);
        System.out.println("Donner la specialite: ");
        specialite = Collections.singleton(scan.nextLine());
    }

    @Override
    public void enseigner() {

    }

    @Override
    public void corrigerExamen() {

    }
}

