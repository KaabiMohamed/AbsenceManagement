/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.absence.DAO;

import Gestion.absence.ClasseEntite.Classe;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Personal computer
 */
public class DAOClasse extends DAO<Classe>{
    
    public DAOClasse(){
        super();
    }

    @Override
    public boolean ajouter(Classe obj) {
        String req ="INSERT INTO `gesabsence`.`Classe`(`niveauClasse`,`nomClasse`,`brancheClasse`) VALUES ('"+obj.getNiv()+"','"+obj.getNom()+"','"+obj.getBranche()+"');";
        return this.getConnect().executerUpdate(req);
    }

    @Override
    public boolean update(Classe obj) {
if (find(obj.getId())!=null)
        {
       String req = "UPDATE  `gesabsence`.`Classe` SET  `nomClasse` =  '"+obj.getNom()+"',`niveauClasse` =  '"+obj.getNiv()+"',`brancheClasse` = '"+obj.getBranche()+"' WHERE  `Classe`.`idClasse` ="+obj.getId()+";";
         return this.getConnect().executerUpdate(req);
        }
        else return false;    }

    @Override
    public boolean supprimer(Classe obj) {
String req = "DELETE FROM `gesabsence`.`Classe` WHERE `Classe`.`idClasse` ="+ obj.getId()+";";
        return this.getConnect().executerUpdate(req);
    }

    @Override
    public Classe find(int id) {
        try {
        String req ="SELECT * FROM  `gesabsence`.`Classe` WHERE  `idClasse` ="+id+";";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();
           
                while (rs.next()) {
                    return new Classe (rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            return null;
    }
    public Classe findNomNiveau(int niveau, String Nom ) {
         try {
                String req ="SELECT * FROM `Classe` WHERE `niveauclasse` ="+niveau+" AND `nomclasse` LIKE '"+Nom.toUpperCase()+"'";
                if (this.getConnect().executerRequete(req))
                {
                    ResultSet rs =this.getConnect().getRs();


                while (rs.next())
                       {
                        return new Classe(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getString(4));
                       }
                 }
               }
                catch (SQLException ex)
                {
                    Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                 }
                return null;
                }
    public Classe findNomNiveauBra(int niveau, String Nom,String Bran) {
         try {
                String req ="SELECT * FROM `Classe` WHERE `niveauclasse` ="+niveau+" AND `nomclasse` LIKE '"+Nom.toUpperCase()+"' AND `brancheclasse` LIKE '"+Bran.toUpperCase()+"'";
                if (this.getConnect().executerRequete(req))
                {
                    ResultSet rs =this.getConnect().getRs();


                while (rs.next())
                       {
                        return new Classe(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getString(4));
                       }
                 }
               }
                catch (SQLException ex)
                {
                    Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                    return null;
                 }
                return null;
                }

    @Override
    public List<Classe> charge() {
        
        List<Classe> lc= new ArrayList<Classe>();

         try {
        String req ="SELECT * FROM  `gesabsence`.`Classe` ORDER BY `niveauClasse`,`nomClasse`";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();

                while (rs.next()) {
                    lc.add(new Classe(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getString(4)));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        return lc;
    }
/*public int nbClasse(){
    int nbc;
String req = "Count(*) from `gesabsence`.`Classe`";
        if (this.getConnect().executerUpdate(req)){
            
        }
     return nbc;       
    }*/
    
     public List<Classe> chargebranche() {
        
        List<Classe> lc= new ArrayList<Classe>();

         try {
        String req ="SELECT * FROM  `gesabsence`.`Classe`";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();

                while (rs.next()) {
                    lc.add(new Classe(rs.getInt(1), rs.getInt(2),rs.getString(3),rs.getString(4)));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        return lc;
    }
     public  List getClassame() throws Exception
     {
         ArrayList <String>l=new ArrayList<String>();
         String req="select Distinct(nomClasse) from classe";
         if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();

                while (rs.next()) {
                    l.add(rs.getString(1));
                }
            }
         
         return l;
     }
     
         public Classe findByName(String name) {
        try {
        String req ="SELECT * FROM  `gesabsence`.`Classe` WHERE  `nomClasse` = '"+name+"';";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();
           
                while (rs.next()) {
                    return new Classe (rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            return null;
    }
     public static void main(String[]args)
     {
        try {
            System.out.println(new DAOClasse().getClassame());
        } catch (Exception ex) {
            Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}