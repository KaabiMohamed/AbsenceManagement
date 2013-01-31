/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.absence.DAO;

import Gestion.absence.ClasseEntite.Matiere;
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
public class DAOMatiere extends DAO<Matiere>{
    
    public DAOMatiere(){
        super();
    }

    @Override
    public boolean ajouter(Matiere obj) {
        String req ="INSERT INTO `gesabsence`.`Matiere`(`idMatiere`,`idClasse`,`nomMatiere`,`nbAbsences`,`nbSeanceMax`,`nbAbsMax`) VALUES ('"+obj.getIdMatiere()+"','"+obj.getClasse().getId()+"','"+obj.getNomMatiere()+"','"+obj.getNbAbsences()+"','"+obj.getNbSeancemax()+"','"+obj.getNbAbsMax()+"');";
        return this.getConnect().executerUpdate(req);
    }

    @Override
    public boolean update(Matiere obj) {
if (find(obj.getIdMatiere())!=null)
        {
       String req = "UPDATE  `gesabsence`.`matiere` SET  `idMatiere` =  '"+obj.getIdMatiere()+"',`idClasse` =  '"+obj.getClasse().getId()+"',`nomMatiere` = '"+obj.getNomMatiere()+"',`nbAbsences`='"+obj.getNbAbsences()+"',`nbSeanceMax`='"+obj.getNbSeancemax()+"',`nbAbsMax`='"+obj.getNbAbsMax()+"' WHERE  `Matiere`.`idMatiere` ="+obj.getIdMatiere()+";";
         return this.getConnect().executerUpdate(req);
        }
        else return false;    
    }    

    @Override
    public boolean supprimer(Matiere obj) {
        String req = "DELETE FROM `gesabsence`.`Matiere` WHERE `Matiere`.`idMatiere` ="+ obj.getIdMatiere()+";";
        return this.getConnect().executerUpdate(req);
    }

    @Override
    public Matiere find(int id) {
            try {
        String req ="SELECT * FROM  `gesabsence`.`Matiere` WHERE  `idMatiere` ='"+id+"';";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs = this.getConnect().getRs();
           DAOClasse clDAO = new DAOClasse();
                while (rs.next()) {
                    return new Matiere (rs.getInt(1),clDAO.find(rs.getInt(2)),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            return null;
    
    }
    
    
    public Matiere findcl(int id,String nom) {
            try {
        String req ="SELECT * FROM  `gesabsence`.`Matiere` WHERE  `idClasse` ='"+id+"' AND `nomMatiere` LIKE '"+nom.toUpperCase()+"';";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs = this.getConnect().getRs();
           DAOClasse clDAO = new DAOClasse();
                while (rs.next()) {
                    return new Matiere (rs.getInt(1),clDAO.find(rs.getInt(2)),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            return null;
    
    }

    public List<Matiere> chargenom(String nom) {
        List<Matiere> lm= new ArrayList<Matiere>();

         try {
        String req ="SELECT * FROM  `gesabsence`.`Matiere` WHERE `nomMatiere` = '"+nom.toUpperCase()+"';";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =(ResultSet)this.getConnect().getRs();
DAOClasse clDAO = new DAOClasse();
                while (rs.next()) {
                    lm.add(new Matiere (rs.getInt(1),clDAO.find(rs.getInt(2)),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6)));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        return lm;
    }
    @Override
    public List<Matiere> charge() {
        List<Matiere> lm= new ArrayList<Matiere>();

         try {
        String req ="SELECT * FROM  `gesabsence`.`Matiere` ORDER BY `idClasse`";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =(ResultSet)this.getConnect().getRs();
DAOClasse clDAO = new DAOClasse();
                while (rs.next()) {
                    lm.add(new Matiere (rs.getInt(1),clDAO.find(rs.getInt(2)),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6)));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        return lm;
    }
    
    public List<Matiere> chargeIDclasse(int id) {
        List<Matiere> lm= new ArrayList<Matiere>();

         try {
        String req ="SELECT * FROM  `gesabsence`.`Matiere` WHERE `gesabsence`.`Matiere`.`idClasse` ="+id+" ";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =(ResultSet)this.getConnect().getRs();
            DAOClasse clDAO = new DAOClasse();
                while (rs.next()) {
                    lm.add(new Matiere (rs.getInt(1),clDAO.find(rs.getInt(2)),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6)));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        return lm;
    }
    public Matiere findNom(String nom) {
            try {
        String req ="SELECT * FROM  `gesabsence`.`Matiere` WHERE  `nomMatiere`='"+nom.toUpperCase()+"';";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs = this.getConnect().getRs();
           DAOClasse clDAO = new DAOClasse();
                while (rs.next()) {
                    return new Matiere (rs.getInt(1),clDAO.find(rs.getInt(2)),rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            return null;
    
    }
       public  List getMatname() throws Exception
     {
         ArrayList <String>l=new ArrayList<String>();
         String req="select Distinct(nomMatiere) from matiere";
         if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();

                while (rs.next()) {
                    l.add(rs.getString(1));
                }
            }
         
         return l;
     }
    public static void main(String[]args) throws Exception{
        List   rs = new DAOMatiere().getMatname();
        for (int i=0 ;i<rs.size();i++){
        System.out.println(rs.get(i));
        } }
}
