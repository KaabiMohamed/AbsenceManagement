/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.absence.ClasseEntite;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Personal computer
 */
public class Etudiant{
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private int cin;
    private String nom;
    private String prenom;
    private Classe classe;
    private String email;
    private int gsm;
    private String sexe;
    private String login;
    private String pwd;
    
    /**
     * Constructeurs
     *
     */
    public Etudiant(int cin, String nom, String prenom){
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public Etudiant(int cin, String nom, String prenom,Classe classe){
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
    }
    public Etudiant(){
        this.cin = 0;
        this.nom = null;
        this.prenom = null;
        this.classe = null;
    }

    public Etudiant(int cin, String nom, String prenom, Classe classe, String sexe, String email,int gsm, String login, String pwd) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.email = email;
        this.sexe = sexe;
        this.gsm = gsm;
        this.login = login;
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String OldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email",OldEmail,email);
    }

    public int getGsm() {
        return gsm;
    }

    public void setGsm(int gsm) {
        int OldGsm = this.gsm;
        this.gsm = gsm;
        changeSupport.firePropertyChange("gsm",OldGsm,gsm);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        String OldLogin = this.login;
        this.login = login;
        changeSupport.firePropertyChange("login",OldLogin,login);
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        String OldPwd = this.pwd;
        this.pwd = pwd;
        changeSupport.firePropertyChange("pwd",OldPwd,pwd);
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        String OldSex = this.sexe;
        this.sexe = sexe;
        changeSupport.firePropertyChange("sexe",OldSex,sexe);
    }
    
    

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        int OldCIN = this.cin;
        this.cin = cin;
        changeSupport.firePropertyChange("cin",OldCIN,cin);
    }

    public String getNom() {
        return nom;
    }

   
    public void setNom(String nom) {
        String oldname = this.nom;
        this.nom = nom;
        changeSupport.firePropertyChange("nom", oldname, nom);
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        String OldPrenom = this.prenom;
        this.prenom = prenom;
        changeSupport.firePropertyChange("prenom",OldPrenom,prenom);
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        
        this.classe = classe;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Etudiant other = (Etudiant) obj;
        if (this.cin != other.cin) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.cin;
        return hash;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", classe=" + classe + ", email=" + email + ", gsm=" + gsm + ", sexe=" + sexe + ", login=" + login + ", pwd=" + pwd + '}';
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
    
    
}
