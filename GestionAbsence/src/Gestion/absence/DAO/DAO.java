/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.absence.DAO;

import Gestion.absence.ClasseTechnique.ConnexionMySql;
import java.util.List;

/**
 *
 * @author Personal computer
 */
public abstract class DAO<T> {
    private ConnexionMySql connect = null;
    
    public DAO(){

            // connect = new ConnexionMySql();
             connect = ConnexionMySql.getInstance();
        }
    /**
     * 
     * Méthode d'ajout
     * @param obj
     * @return
     */
    public abstract boolean ajouter(T obj);
    /**
     * 
     * Méthode de MAJ
     * @param obj
     * @return 
     */
    public abstract boolean update(T obj);
    /**
     * 
     * Méthode de suppression
     * @param obj
     * @return 
     */
    public abstract boolean supprimer(T obj);
    /**
     * 
     * Méthode de recherche
     * @param id
     * @return 
     */
    public abstract T find(int id);
    
    /**
     * Charge une liste
     * @return 
     */
      
    public abstract List<T> charge();
    
    public ConnexionMySql getConnect() {
        
   
        return connect;
    } 
    public void setConnect(ConnexionMySql connect) {
        this.connect = connect;
    }
}
