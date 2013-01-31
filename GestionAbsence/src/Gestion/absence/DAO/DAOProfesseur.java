/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.absence.DAO;

import Gestion.absence.ClasseEntite.Professeur;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marthym
 */
public class DAOProfesseur extends DAO<Professeur> {

    /*
     * Methode d'ajout d'un professeur
     */
    @Override
    public boolean ajouter(Professeur obj) {
        String req ="INSERT INTO `gesabsence`.`professeur` (`cinProf`, `nomProf`, `prenomProf`, `nomMatiere`, `sexeProf`, `emailProf`, `gsmProf`, `loginProf`, `pwdProf`) VALUES ('"+obj.getCinProf()+"','"+obj.getNomProf()+"','"+obj.getPrenomProf()+"','"+obj.getMatiere()+"','"+obj.getSexe()+"','"+obj.getEmail()+"','"+obj.getGsm()+"','"+obj.getLogin()+"','"+obj.getPwd()+"');";
        return this.getConnect().executerUpdate(req);
    }

    /*
     * methode de mise a jour 'un professeur
     */
    @Override
    public boolean update(Professeur obj) {
        if (find(obj.getCinProf())!=null)
        {
       String req = "UPDATE  `gesabsence`.`Professeur` SET  `cinProf` =  '"+obj.getCinProf()+"',`nomProf` =  '"+obj.getNomProf()+"',`prenomprof` =  '"+obj.getPrenomProf()+"',`nomMatiere` = '"+obj.getMatiere()+"',`sexeprof` =  '"+obj.getSexe()+"',`emailprof` =  '"+obj.getEmail()+"',`gsmprof` =  '"+obj.getGsm()+"',`loginprof` =  '"+obj.getLogin()+"',`pwdprof` =  '"+obj.getPwd()+"' WHERE  `Professeur`.`cinProf` ="+obj.getCinProf()+";";
         return this.getConnect().executerUpdate(req);
        }
        else return false;
    }
/*
     * methode de supression d'un professeur
     */
    @Override
    public boolean supprimer(Professeur obj) {
        String req = "DELETE FROM `gesabsence`.`Professeur` WHERE `Professeur`.`cinProf` ="+ obj.getCinProf()+";";
        return this.getConnect().executerUpdate(req);
    }

    /*
     * 
     * Methode de recherche par CIN PROFESSEUR
     */
    @Override
    public Professeur find(int cin) {
try {
        String req ="SELECT * FROM  `gesabsence`.`Professeur` WHERE  `cinProf` ='"+cin+"';";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();
           DAOMatiere matDAO = new DAOMatiere();
                while (rs.next()) {
                    return new Professeur (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            return null;    
    }
    /*
     * Methode de recherche par login et mot de passe PROFESSEUR
     */
    public Professeur findlogpwd(String log, String pwd) {
try {
        String req ="SELECT * FROM  `gesabsence`.`Professeur` WHERE  `loginProf` = '"+log+"' AND `pwdProf` LIKE '"+pwd+"';";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();
           DAOMatiere matDAO = new DAOMatiere();
                while (rs.next()) {
                    return new Professeur (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            return null;    
    }
    /*
     * Recherche par email
     */
    public Professeur findemail(String email) {
        try {
        String req ="SELECT * FROM  `gesabsence`.`professeur` WHERE  `emailProf` ='"+email+"';";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();
           
                while (rs.next()) {
                    return new Professeur (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            return null;
    }
    /*
     * Methode de recherche par matiere Professeur
     */
    
    public Professeur findMat(int cin, String nmat) {
try {
        String req ="SELECT * FROM  `gesabsence`.`Professeur` WHERE  `cinProf` ='"+cin+"' AND `nomMatiere` ='"+nmat+"' ;";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();
           DAOMatiere matDAO = new DAOMatiere();
                while (rs.next()) {
                    return new Professeur (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            return null;   
    }
    
    

    /*
     * Methode de remplissage d'une liste de professeurs
     */
    @Override
    public List<Professeur> charge() {
List<Professeur> lp= new ArrayList<Professeur>();

         try {
        String req ="SELECT * FROM  `gesabsence`.`Professeur`";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();
                            DAOMatiere matDAO = new DAOMatiere();
                while (rs.next()) {
                    lp.add(new Professeur (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9)));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        return lp;
    }
    
    /*
     * methode de remplissage d'une liste de professeurs par matiere
     */
    public List<Professeur> chargeParMatiere(String nmat) {
        List<Professeur> lpm= new ArrayList<Professeur>();

         try {
        String req ="SELECT * FROM  `gesabsence`.`Professeur` WHERE `gesabsence`.`Professeur`.`nomMatiere` ='"+nmat+"';";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();
           DAOMatiere matDAO = new DAOMatiere();
                while (rs.next()) {
                    lpm.add(new Professeur (rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9)));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        return lpm;
    }    
}
