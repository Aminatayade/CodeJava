package etablissement;

import java.sql.Date;
import java.util.Scanner;

import etablissement.GestionClasses.Classe;
import etablissement.GestionClasses.Composition;
import etablissement.GestionClasses.Eleve;
import etablissement.GestionClasses.Matiere;

public class Methodes {
    static Scanner sc = new Scanner(System.in);
    
    public static void InitialiserEtudiant(Eleve E) {
        
        System.out.print("Veuillez entrer votre nom : ");
        E.setNom(sc.next());
        System.out.print("Veuillez entrer votre prenom : ");
        E.setPrenom(sc.nextLine());
        System.out.print("Veuillez entrer votre date de naissance sous format yyy-mm-dd : ");
        String testDate = sc.next();
        E.setDateNaissance(Date.valueOf(testDate));
        String testSexe = "";
        do {
            System.out.print("Veuillez renseigner le sexe (Masculin ou Feminin) : ");
            testSexe = sc.next().toUpperCase();
        } while (!(testSexe.equals("MASCULIN") || testSexe.equals("FEMININ")));
        E.setSexe(testSexe);
    }

    public static void InitialiserNote(Eleve E, Matiere M) {
        Composition c = new Composition();
        c.setEleve(E);
        c.setMatiere(M);

        float note;
        do {
            System.out.print("Veuillez saisir la note de l'etudiant : ");
            note = sc.nextFloat();
        } while (!(note >= 0 && note <= 20));
        c.setNote(note);
    }

    public static void afficherMatiere(Matiere M) {
        System.out.println("La matiere concernee est : " + M.getNom());
        System.out.println("Cette matiere a comme code : " + M.getCode());
        System.out.println("Son coefficient est de : " + M.getCoefficient());
    }

    public static void afficherEleves(Classe C) {
        Eleve[] t = C.getEleves();
        System.out.println("Nom de la classe : " + C.getNom());
        System.out.println("Effectif de la classe : " + C.getEffectif());
        for (int i = 0; i < t.length; i++) {
            System.out.println("Eleve n°" + (i + 1) + " : ");
            System.out.println("\tNom : " + t[i].getNom());
            System.out.println("\tPrenom : " + t[i].getPrenom());
            System.out.println("\tDate de Naissance : " + t[i].getDateNaissance());
            System.out.println("\tSexe : " + t[i].getSexe());
        }
    }
}