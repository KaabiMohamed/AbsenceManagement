/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.absence.DAO;
import Gestion.absence.ClasseEntite.Etudiant;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Personal computer
 */
public class DAOEtudiant extends DAO<Etudiant>{
    
    public DAOEtudiant(){
        super();
    }

    /*
     * methode d'ajout d'un Etudiant
     */
    @Override
    public boolean ajouter(Etudiant obj) {
        String req ="INSERT INTO `gesabsence`.`etudiant` (`cinEtudiant`, `nomEtudiant`, `prenomEtudiant`, `idClasse`, `sexeEtudiant`, `emailEtudiant`, `gsmEtudiant`, `loginEtudiant`, `pwdEtudiant`) VALUES ('"+obj.getCin()+"','"+obj.getNom()+"','"+obj.getPrenom()+"','"+obj.getClasse().getId()+"','"+obj.getSexe()+"','"+obj.getEmail()+"','"+obj.getGsm()+"','"+obj.getLogin()+"','"+obj.getPwd()+"');";
        return this.getConnect().executerUpdate(req);
    }

    /*
     * methode de mise a jour d'un etudiant
     */
    @Override
    public boolean update(Etudiant obj) {
        if (find(obj.getCin())!=null)
        {
       String req = "UPDATE  `gesabsence`.`Etudiant` SET  `cinEtudiant` =  '"+obj.getCin()+"',`nomEtudiant` =  '"+obj.getNom()+"',`prenomEtudiant` =  '"+obj.getPrenom()+"',`idClasse` = '"+obj.getClasse().getId()+"',`sexeEtudiant` =  '"+obj.getSexe()+"',`emailEtudiant` =  '"+obj.getEmail()+"',`gsmEtudiant` =  '"+obj.getGsm()+"',`loginEtudiant` =  '"+obj.getLogin()+"',`pwdEtudiant` =  '"+obj.getPwd()+"' WHERE  `Etudiant`.`cinEtudiant` ="+obj.getCin()+";";
         return this.getConnect().executerUpdate(req);
        }
        else return false;    
    }

    /*
     * methode de suppression d'un etudiant
     */
    @Override
    public boolean supprimer(Etudiant obj) {
        String req = "DELETE FROM `gesabsence`.`etudiant` WHERE `etudiant`.`cinEtudiant` ="+ obj.getCin()+";";
        return this.getConnect().executerUpdate(req);
    }

    /*
     * methode de recherche d'etudiants par CIN
     */
    @Override
    public Etudiant find(int cin) {
        try {
        String req ="SELECT * FROM  `gesabsence`.`Etudiant` WHERE  `cinEtudiant` ='"+cin+"';";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();
           DAOClasse clDAO = new DAOClasse();
                while (rs.next()) {
                    return new Etudiant (rs.getInt(1),rs.getString(2),rs.getString(3),clDAO.find(rs.getInt(4)),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            return null;
    }

    /*
     * Recherche par Login et mot de passe ETUDIANT
     */
    public Etudiant findlogpwd(String login,String pwd) {
        try {
        String req ="SELECT * FROM  `gesabsence`.`Etudiant` WHERE  `loginEtudiant` ='"+login+"' AND `pwdEtudiant` ='"+pwd+"';";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();
           DAOClasse clDAO = new DAOClasse();
                while (rs.next()) {
                    return new Etudiant (rs.getInt(1),rs.getString(2),rs.getString(3),clDAO.find(rs.getInt(4)),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9));
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
    public Etudiant findemail(String email) {
        try {
        String req ="SELECT * FROM  `gesabsence`.`Etudiant` WHERE  `emailEtudiant` ='"+email+"';";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();
           DAOClasse clDAO = new DAOClasse();
                while (rs.next()) {
                    return new Etudiant (rs.getInt(1),rs.getString(2),rs.getString(3),clDAO.find(rs.getInt(4)),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            return null;
    }
    
    
    /*
     * methode de chargement d'une liste d'etudiants
     */
    @Override
    public List<Etudiant> charge() {
        List<Etudiant> le= new ArrayList<Etudiant>();

         try {
        String req ="SELECT * FROM  `gesabsence`.`Etudiant`";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();
            DAOClasse clDAO = new DAOClasse();
                while (rs.next()) {
                    le.add(new Etudiant (rs.getInt(1),rs.getString(2),rs.getString(3),clDAO.find(rs.getInt(4)),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9)));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        return le;
    }
    
    /*
     * methode de chargement d'une liste d'etudiants par classe
     */
    public List<Etudiant> chargeParClasse(int id) {
        List<Etudiant> le= new ArrayList<Etudiant>();

         try {
        String req ="SELECT * FROM  `gesabsence`.`Etudiant`WHERE `gesabsence`.`Etudiant`.`idClasse` ='"+id+"';";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();
               DAOClasse clDAO = new DAOClasse();
                while (rs.next()) {
                    le.add(new Etudiant (rs.getInt(1),rs.getString(2),rs.getString(3),clDAO.find(rs.getInt(4)),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getString(9)));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        return le;
    }
    
}
