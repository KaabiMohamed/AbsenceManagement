/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.absence.ClasseEntite;

/**
 *
 * @author Personal computer
 */
public class Classe {
    
    private int id;
    private int niv;
    private String nom;
    private String branche;
    
   /*
     * Constructeurs
     */
    public Classe (int id, int niv, String nom, String branche){
        this.id = id;
        this.niv = niv;
        this.nom = nom;
        this.branche = branche;
    }
    
    public Classe (int niv, String nom, String branche){
        this.niv = niv;
        this.nom = nom;
        this.branche = branche;
    }
    public Classe (int niv, String nom){
        this.niv = niv;
        this.nom = nom;
    }
    public Classe (){
        this.niv = 0;
        this.nom = "";
        this.branche = "";
    }
    /*
     * Getteurs et Setteurs
     */

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNiv() {
        return niv;
    }

    public void setNiv(int niv) {
        this.niv = niv;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Classe other = (Classe) obj;
        if (this.niv != other.niv) {
            return false;
        }
        if ((this.nom == null) ? (other.nom != null) : !this.nom.equals(other.nom)) {
            return false;
        }
        if ((this.branche == null) ? (other.branche != null) : !this.branche.equals(other.branche)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

   

    

    @Override
    public String toString() {
        return "Classe{" + "id=" + id + ", niv=" + niv + ", nom=" + nom + ", branche=" + branche + '}';
    }
    
    
}
