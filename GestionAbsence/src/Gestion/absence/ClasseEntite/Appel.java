/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.absence.ClasseEntite;

/**
 *
 * @author Personal computer
 */
public class Appel {
    private int id;
    private int cinEtudiant;
    private int cinProf;
    private int idMatiere;
    private String date;
    private String heureDebut;
    private String heureFin;
    
    public Appel(){
    this.cinEtudiant = 0;
    
    this.idMatiere = 0;
    this.date="";
    this.heureDebut="";
    this.heureFin="";
}

    public Appel(int id,int cinEtudiant,  int idMatiere, String date, String heureDebut, String heureFin) {
        this.id=id;
        this.cinEtudiant = cinEtudiant;
        
        this.idMatiere = idMatiere;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }
        public Appel(int cinEtudiant,  int idMatiere, String date, String heureDebut, String heureFin) {
        
        this.cinEtudiant = cinEtudiant;
       
        this.idMatiere = idMatiere;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    public int getCinEtudiant() {
        return cinEtudiant;
    }

    public void setCinEtudiant(int cinEtudiant) {
        this.cinEtudiant = cinEtudiant;
    }



    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMatiere() {
        return idMatiere;
    }

    public void setIdMatiere(int idMatiere) {
        this.idMatiere = idMatiere;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Appel other = (Appel) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.cinEtudiant != other.cinEtudiant) {
            return false;
        }
        
        
        if (this.idMatiere != other.idMatiere) {
            return false;
        }
        if ((this.date == null) ? (other.date != null) : !this.date.equals(other.date)) {
            return false;
        }
        if ((this.heureDebut == null) ? (other.heureDebut != null) : !this.heureDebut.equals(other.heureDebut)) {
            return false;
        }
        if ((this.heureFin == null) ? (other.heureFin != null) : !this.heureFin.equals(other.heureFin)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + this.cinEtudiant;
        
        hash = 29 * hash + this.idMatiere;
        hash = 29 * hash + (this.date != null ? this.date.hashCode() : 0);
        hash = 29 * hash + (this.heureDebut != null ? this.heureDebut.hashCode() : 0);
        hash = 29 * hash + (this.heureFin != null ? this.heureFin.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Appel{" + "id=" + id + ", cinEtudiant=" + cinEtudiant + ", idMatiere=" + idMatiere + ", date=" + date + ", heureDebut=" + heureDebut + ", heureFin=" + heureFin + '}';
    }
    
    
}