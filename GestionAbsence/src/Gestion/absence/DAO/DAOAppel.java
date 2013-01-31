/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.absence.DAO;

import Gestion.absence.ClasseEntite.Appel;
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
public class DAOAppel extends DAO<Appel> {

    public DAOAppel() {
         super();
    }

    @Override
    public boolean ajouter(Appel obj) {
        String req ="INSERT INTO `gesabsence`.`appel`(`cinEtudiant`,`idMatiere`,`date`,`heureDebut`,`heureFin`) VALUES ('"+obj.getCinEtudiant()+"','"+obj.getIdMatiere()+"','"+obj.getDate()+"','"+obj.getHeureDebut()+"','"+obj.getHeureFin()+"');";
        return this.getConnect().executerUpdate(req);
    }

    @Override
    public boolean update(Appel obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean supprimer(Appel obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Appel find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Appel> charge() {
                List<Appel> labs= new ArrayList<Appel>();

         try {
        String req ="SELECT * FROM  appel";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();

                while (rs.next()) {
                    labs.add(new Appel(rs.getInt("id"),rs.getInt("cinEtudiant"),rs.getInt("idMatiere"),rs.getString("date"),rs.getString("heureDebut"),rs.getString("heureFin")));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        return labs;
    }
    public List<Appel> chargeByMatEtu (int cinEtudiant , int idMatiere){
        List<Appel> labs= new ArrayList<Appel>();
         try {
        String req ="SELECT * FROM  appel where idMatiere='"+idMatiere+"' and cinEtudiant='"+cinEtudiant+"'";
        if (this.getConnect().executerRequete(req)){
            ResultSet rs =this.getConnect().getRs();

                while (rs.next()) {
                    labs.add(new Appel(rs.getInt("id"),rs.getInt("cinEtudiant"),rs.getInt("idMatiere"),rs.getString("date"),rs.getString("heureDebut"),rs.getString("heureFin")));
                }
            }

    }catch (SQLException ex) {
                Logger.getLogger(DAOClasse.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }

        return labs;
    }
    
            
    
    public static void main(String args[]) {
      
        
       Appel appel;
       appel = new Appel(12213233,2,"12/10","14h","15h");
       DAOAppel dd = new DAOAppel();
       //dd.ajouter(appel);
        List<Appel> labs= new ArrayList<Appel>();
        labs=dd.charge();
//       for(int i=0;i<labs.size();i++)
//            {
//            System.out.println(labs.getClass());
//             
//            }
       System.out.print(dd.chargeByMatEtu(22222222, 1));
        
        
        
    }
    
}
