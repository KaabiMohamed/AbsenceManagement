/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.absence.PDF;
import Gestion.absence.ClasseEntite.Appel;
import Gestion.absence.ClasseEntite.Etudiant;
import Gestion.absence.ClasseEntite.Matiere;
import Gestion.absence.DAO.DAOAppel;
import Gestion.absence.DAO.DAOMatiere;
import Gestion.absence.Graphique.Login;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Personal computer
 */
public class ExportPDF {
    
public void Export() throws Exception{
String Text="";
Etudiant etud = Login.etd;
String nomEtudiant=etud.getNom();
String prenomEtudiant=etud.getPrenom();
int cinEtudiant=etud.getCin();
DAOAppel daoAppel = new DAOAppel();

Appel appel;
Matiere matiere;
DAOMatiere daoMatiere = new DAOMatiere();
List   rs = new DAOMatiere().getMatname();
for (int i=0 ;i<rs.size();i++){
String nomMat =rs.get(i).toString();
int idMatiere= daoMatiere.findNom(nomMat).getIdMatiere();
Text+="\n---------------------------------------";
Text+="\n Nom Matiere :  "+nomMat+"";
Text+="\n---------------------------------------";
List<Appel> abs= daoAppel.chargeByMatEtu(cinEtudiant,idMatiere);
for (int j=0;j<abs.size();j++){
    int count=+j+1;
Text+="\n "+count+"- Date D'absence :"+abs.get(j).getDate() +"  ";
Text+="Heure Debut:  :"+abs.get(j).getHeureDebut() +"  ";
Text+="Heure Fin:  :"+abs.get(j).getHeureFin() +"  ";
    
}

} 
    
    
    
    
    Paragraph paragraph;
    
    paragraph = new Paragraph(Text);
    Document document=new Document(); 
    PdfWriter.getInstance(document,new FileOutputStream("Releve Absence de "+nomEtudiant+" "+prenomEtudiant+".pdf")); 
    document.open(); document.add(paragraph);
    document.close(); 
}
    
}
