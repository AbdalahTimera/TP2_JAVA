package entites;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.Set;

public class Personne {

    protected String nom;
    protected String prenom;
    protected LocalDate DateNaiss;

    public Personne() {
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Personne(String nom, String prenom, LocalDate dateNaiss) {
        this.nom = nom;
        this.prenom = prenom;
        DateNaiss = dateNaiss;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateNaiss() {
        return DateNaiss;
    }

    public void setDateNaiss(LocalDate dateNaiss) {
        DateNaiss = dateNaiss;
    }
    public void saisie(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Donner le nom");
        nom = scan.nextLine();
        System.out.println("Donner le prenom");
        prenom = scan.nextLine();
        System.out.println("Donner le date");
        DateNaiss = LocalDate.parse(scan.nextLine());
    }
}
