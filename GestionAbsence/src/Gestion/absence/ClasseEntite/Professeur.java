/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.absence.ClasseEntite;

/**
 *
 * @author Personal computer
 */
public class Professeur {
    private int cinProf;
    private String nomProf;
    private String prenomProf;
    private String matiere;
    private String email;
    private int gsm;
    private String sexe;
    private String login;
    private String pwd;

    public Professeur(int cinProf, String nomProf, String prenomProf, String matiere) {
        this.cinProf = cinProf;
        this.nomProf = nomProf;
        this.prenomProf = prenomProf;
        this.matiere = matiere;
    }

    public Professeur(int cinProf, String nomProf, String prenomProf, String matiere, String sexe, String email, int gsm, String login, String pwd) {
        this.cinProf = cinProf;
        this.nomProf = nomProf;
        this.prenomProf = prenomProf;
        this.matiere = matiere;
        this.email = email;
        this.gsm = gsm;
        this.sexe = sexe;
        this.login = login;
        this.pwd = pwd;
    }
    

    public Professeur() {
        this.cinProf = 0;
        this.nomProf = null;
        this.prenomProf = null;
        this.matiere = null;
    }

    public int getCinProf() {
        return cinProf;
    }

    public void setCinProf(int cinProf) {
        this.cinProf = cinProf;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public String getNomProf() {
        return nomProf;
    }

    public void setNomProf(String nomProf) {
        this.nomProf = nomProf;
    }

    public String getPrenomProf() {
        return prenomProf;
    }

    public void setPrenomProf(String prenomProf) {
        this.prenomProf = prenomProf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGsm() {
        return gsm;
    }

    public void setGsm(int gsm) {
        this.gsm = gsm;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Professeur other = (Professeur) obj;
        if (this.cinProf != other.cinProf) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.cinProf;
        return hash;
    }

    @Override
    public String toString() {
        return "Professeur{" + "cinProf=" + cinProf + ", nomProf=" + nomProf + ", prenomProf=" + prenomProf + ", matiere=" + matiere + ", email=" + email + ", gsm=" + gsm + ", sexe=" + sexe + ", login=" + login + ", pwd=" + pwd + '}';
    }

    
    
    
    
}
