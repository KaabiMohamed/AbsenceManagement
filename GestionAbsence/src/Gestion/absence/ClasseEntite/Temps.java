/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.absence.ClasseEntite;

/**
 *
 * @author Personal computer
 */
public class Temps {
    private int heure;
    private int minute;

    public Temps() {
        heure = 0;
        minute = 0;
    }

    public Temps(int heure, int minute) {
        this.heure = heure;
        this.minute = minute;
    }

    public int getHeure() {
        return heure;
    }

    public void setHeure(int heure) {
        this.heure = heure;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    public boolean estInf(Temps t1){
        int d1,d2;
        d1=t1.heure-this.heure;
        d2=t1.minute-this.minute;
        if(  (d1<0)||((d1==0)&&(d2<0)) || ((d1<0)&&(d2<0)) )
            return false;
        else
            return true;
    }
    
    @Override
    public String toString(){
        if(minute==0)
            return heure+":"+minute+"0";
        else
            return heure+":"+minute;
    }
}
