/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.absence.ClasseEntite;

/**
 *
 * @author Personal computer
 */
public class Matiere {
    private int idMatiere;
    private Classe classe;
    private String nomMatiere;
    private int nbAbsences;
    private int nbSeancemax;
    private int nbAbsMax;
    
    public Matiere(int idMatiere, Classe classe, String nomMatiere,int nbAbscences){
        this.idMatiere = idMatiere;
        this.classe = classe;
        this.nomMatiere = nomMatiere;
        this.nbAbsences = nbAbscences;
        
    }

    public Matiere(int idMatiere, Classe classe, String nomMatiere, int nbAbsences, int nbSeancemax, int nbAbsMax) {
        this.idMatiere = idMatiere;
        this.classe = classe;
        this.nomMatiere = nomMatiere;
        this.nbAbsences = nbAbsences;
        this.nbSeancemax = nbSeancemax;
        this.nbAbsMax = nbAbsMax;
    }

    public Matiere(Classe classe, String nomMatiere, int nbAbsences, int nbSeancemax, int nbAbsMax) {
        
        this.classe = classe;
        this.nomMatiere = nomMatiere;
        this.nbAbsences = nbAbsences;
        this.nbSeancemax = nbSeancemax;
        this.nbAbsMax = nbAbsMax;
    }
    

    public Matiere(int idMatiere,Classe classe, String nomMatiere) {
        this.idMatiere = idMatiere;
        this.nomMatiere = nomMatiere;
        this.classe = classe;
        this.nbAbsences = 0;
    }

    public Matiere(Classe classe, String nomMatiere) {
        this.nbAbsences = 0;
        this.classe = classe;
        this.nomMatiere = nomMatiere;
    }
    public Matiere() {
        this.nbAbsences = 0;
        this.classe = null;
        this.nomMatiere = null;
    }
    

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    public String getNomMatiere() {
        return nomMatiere;
    }

    public void setNomMatiere(String nomMatiere) {
        this.nomMatiere = nomMatiere;
    }

    public int getNbAbsences() {
        return nbAbsences;
    }

    public void setNbAbsences(int nbAbsences) {
        this.nbAbsences = nbAbsences;
    }

    public int getNbAbsMax() {
        return nbAbsMax;
    }

    public void setNbAbsMax(int nbAbsMax) {
        this.nbAbsMax = nbAbsMax;
    }

    public int getNbSeancemax() {
        return nbSeancemax;
    }

    public void setNbSeancemax(int nbSeancemax) {
        this.nbSeancemax = nbSeancemax;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Matiere other = (Matiere) obj;
        if (this.classe != other.classe && (this.classe == null || !this.classe.equals(other.classe))) {
            return false;
        }
        if ((this.nomMatiere == null) ? (other.nomMatiere != null) : !this.nomMatiere.equals(other.nomMatiere)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public String toString() {
        return "Matiere{" + "idMatiere=" + idMatiere + ", classe=" + classe + ", nomMatiere=" + nomMatiere + ", nbAbsences=" + nbAbsences + ", nbSeancemax=" + nbSeancemax + ", nbAbsMax=" + nbAbsMax + '}';
    }

    
    
    
}
