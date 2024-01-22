package action;

import actor.*;

public class Paint{
    
    public static void born(People p, Mystery m){
        if(p.getFeel()){
            m.setMystery(true);
            System.out.println("Paint:born feel близость " + p.toString() + " " + m.toString());
        }
    }


}
