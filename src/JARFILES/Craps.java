package JARFILES;

import javax.swing.ImageIcon;
import java.net.URL;
public class Craps {
    private Dicee die1, die2;
    private int rollnum,point;
    Craps(){
        die1=new Dicee();
        die2=new Dicee();
        rollnum=0;
        point=0;
        
    }
    public ImageIcon getdiePic(int x){
        if(x==1)
            return die1.getPic();
        else
            return die2.getPic();
    }
    public void roll(){
        rollnum++;
        die1.roll();
        die2.roll();
        if(rollnum==1) point=getTotal();
    }
    public boolean hasWon()
    {
        if(rollnum==1)return (getTotal()==7 || getTotal()==11);
        else return (point==getTotal());
        
    }
    public boolean hasLost(){
        if(rollnum==1) return (getTotal()==2 || getTotal()==3|| getTotal()==10);
        else
            return(getTotal()==7);
        
            
    }
    public int getTotal(){
        return die1.getValue()+die2.getValue();
    }
    public int getPoint(){
        return point;
    }
}
