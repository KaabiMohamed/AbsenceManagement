/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MarquerAbsence.java
 *
 * Created on 21 mai 2012, 02:02:13
 */
package Gestion.absence.Graphique;

import Gestion.absence.ClasseEntite.Appel;
import Gestion.absence.ClasseEntite.Classe;
import Gestion.absence.ClasseEntite.Matiere;
import Gestion.absence.DAO.DAOAppel;
import Gestion.absence.DAO.DAOClasse;
import Gestion.absence.DAO.DAOEtudiant;
import Gestion.absence.DAO.DAOMatiere;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Personal computer
 */
public class MarquerAbsence extends javax.swing.JInternalFrame{
Vector l1;
Vector l2=new Vector();
DefaultListModel model1 = new DefaultListModel();
DefaultListModel model2 = new DefaultListModel();
    private DAOEtudiant DAOe = new DAOEtudiant();
    
    /** Creates new form MarquerAbsence */
    public MarquerAbsence() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MarquerAbsence = new javax.swing.JPanel();
        branche = new javax.swing.JComboBox();
        niveau = new javax.swing.JComboBox();
        classe = new javax.swing.JComboBox();
        annee = new javax.swing.JComboBox();
        mois = new javax.swing.JComboBox();
        heure_debut = new javax.swing.JComboBox();
        matiere = new javax.swing.JComboBox();
        heure_fin = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jour = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximizable(true);
        setResizable(true);

        branche.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Informatique", "Electromecanique", "Telecom", "Branche Commune" }));
        branche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brancheActionPerformed(evt);
            }
        });

        niveau.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        niveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                niveauActionPerformed(evt);
            }
        });

        try {
            List listClasse=new DAOClasse().getClassame();

            for(int i=0;i<listClasse.size();i++)
            {
                classe.addItem(listClasse.get(i));
            }
        } catch (Exception ex) {
            Logger.getLogger(MarquerAbsence.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
        classe.setModel(null);
        */
        //

        annee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2011", "2012", "2013", "2014", "2015" }));

        mois.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre" }));

        heure_debut.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9H", "10H45", "14H", "15H45" }));
        heure_debut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heure_debutActionPerformed(evt);
            }
        });

        try {
            List listMatiere=new DAOMatiere().getMatname();

            for(int i=0;i<listMatiere.size();i++)
            {
                matiere.addItem(listMatiere.get(i));

            }
        } catch (Exception ex) {
            Logger.getLogger(AjouterEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
        */

        heure_fin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10H30", "12H15", "15H30", "17H15" }));

        jLabel1.setText("Classe");

        jLabel2.setText("Matiere");

        jLabel3.setText("Date");

        jLabel4.setText("Hoiraire");

        jButton1.setText("valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jList2);

        jScrollPane3.setViewportView(jList1);

        jButton3.setText(">>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("<<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        javax.swing.GroupLayout MarquerAbsenceLayout = new javax.swing.GroupLayout(MarquerAbsence);
        MarquerAbsence.setLayout(MarquerAbsenceLayout);
        MarquerAbsenceLayout.setHorizontalGroup(
            MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MarquerAbsenceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                .addGap(46, 46, 46))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MarquerAbsenceLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jButton5, 0, 0, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
            .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                            .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jour, 0, 39, Short.MAX_VALUE)
                                .addComponent(niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                                    .addComponent(mois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addComponent(classe, 0, 0, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(annee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(branche, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(75, 75, 75)
                            .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(matiere, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                                    .addComponent(heure_debut, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(heure_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                        .addGap(419, 419, 419)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        MarquerAbsenceLayout.setVerticalGroup(
            MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                                .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(niveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(classe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(branche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(matiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(4, 4, 4)
                                .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(annee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heure_debut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heure_fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(31, 31, 31)
                .addGroup(MarquerAbsenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addGroup(MarquerAbsenceLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(13, 13, 13)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)))
                .addGap(26, 26, 26))
        );

        jButton6.setText("Confirmer les Absences");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MarquerAbsence, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(436, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(353, 353, 353))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MarquerAbsence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void niveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_niveauActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_niveauActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
niveau.setSelectedIndex(0);
classe.setSelectedIndex(0);
branche.setSelectedIndex(0);
matiere.setSelectedIndex(0);
jour.setSelectedIndex(0);
mois.setSelectedIndex(0);
annee.setSelectedIndex(0);
heure_debut.setSelectedIndex(0);
heure_fin.setSelectedIndex(0);
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int niv = Integer.parseInt(niveau.getSelectedItem().toString());
String cls = classe.getSelectedItem().toString();
String brnch = branche.getSelectedItem().toString();
String mat = matiere.getSelectedItem().toString();
String jj = jour.getSelectedItem().toString();
String mm =mois.getSelectedItem().toString();
String aa =annee.getSelectedItem().toString();
String heud =heure_debut.getSelectedItem().toString();
String heuf =heure_fin.getSelectedItem().toString();


       
        List<Gestion.absence.ClasseEntite.Etudiant> lE = DAOe.charge();
        int x;
        x = lE.size();
        l1= new Vector();
        l2=new Vector();
        for (int i = 0; i<x;i++) {
        l1.addElement(lE.get(i).getNom()+" "+lE.get(i).getPrenom()+" "+lE.get(i).getCin());   
        }
        jList1.setListData(l1);
        jList2.setListData(l2);



}//GEN-LAST:event_jButton1ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jList1.getSelectedIndex()!=-1){
            
                l2.add(jList1.getSelectedValue().toString());
                l1.remove(jList1.getSelectedValue().toString());
                jList2.setListData(l2);
                jList1.setListData(l1); 
      
        }else{
            JOptionPane.showMessageDialog(this, "Veuillez selectionner un étudiant", null,JOptionPane.INFORMATION_MESSAGE);
        }// TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DAOEtudiant DaoE = new DAOEtudiant();
      
        List<Gestion.absence.ClasseEntite.Etudiant> lE = DaoE.charge();
        int x;
        x = lE.size();
        l1= new Vector();
        l2=new Vector();
        for (int i = 0; i<x;i++) {
        l1.addElement(lE.get(i).getNom()+" "+lE.get(i).getPrenom());   
        }
        jList1.setListData(l1);
        jList2.setListData(l2);
        
}//GEN-LAST:event_jButton5ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jList2.getSelectedIndex()!=-1){
            
                l1.add(jList2.getSelectedValue().toString());
                l2.remove(jList2.getSelectedValue().toString());
                jList1.setListData(l1);
                jList2.setListData(l2); 
          
        }else{
            JOptionPane.showMessageDialog(this, "Veuillez selectionner un étudiant", null,JOptionPane.INFORMATION_MESSAGE);
        }
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

Appel appel;
DAOAppel DAOa = new DAOAppel();
int niv = Integer.parseInt(niveau.getSelectedItem().toString());
String cls = classe.getSelectedItem().toString();
String brnch = branche.getSelectedItem().toString();
String mat = matiere.getSelectedItem().toString();
String jj = jour.getSelectedItem().toString();
String mm =mois.getSelectedItem().toString();
String aa =annee.getSelectedItem().toString();
String heud =heure_debut.getSelectedItem().toString();
String heuf =heure_fin.getSelectedItem().toString();
String date = jj + mm + aa ;
Classe clas;
DAOClasse DAOc = new DAOClasse();
Matiere mtr;
DAOMatiere DAOm = new DAOMatiere();
clas = DAOc.findByName(cls);
int id_classe = clas.getId();
mtr =DAOm.findNom(mat);
int id_matiere=mtr.getIdMatiere();


 for (int i=0;i<l2.size();i++){
           int cin = Integer.parseInt(l2.get(i).toString().substring(l2.get(i).toString().length()-8,l2.get(i).toString().length()));
           appel = new Appel(cin,id_matiere,date,heud,heuf);
           DAOa.ajouter(appel);
}
 JOptionPane.showMessageDialog(rootPane, "Absence Ajoutee a la base"); 

   
    // TODO add your handling code here:
}//GEN-LAST:event_jButton6ActionPerformed

private void brancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brancheActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_brancheActionPerformed

private void heure_debutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heure_debutActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_heure_debutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MarquerAbsence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarquerAbsence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarquerAbsence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarquerAbsence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MarquerAbsence().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MarquerAbsence;
    private javax.swing.JComboBox annee;
    private javax.swing.JComboBox branche;
    private javax.swing.JComboBox classe;
    private javax.swing.JComboBox heure_debut;
    private javax.swing.JComboBox heure_fin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox jour;
    private javax.swing.JComboBox matiere;
    private javax.swing.JComboBox mois;
    private javax.swing.JComboBox niveau;
    // End of variables declaration//GEN-END:variables
}
