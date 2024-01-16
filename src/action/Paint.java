package action;

import actor.*;
import java.util.Objects;

public class Paint{
    
    public static void born(People p, Mystery m){
        if(!Objects.isNull(p.getFeel())){
            m.setMystery(true);
            System.out.println("Paint:born feel близость " + p.toString() + " " + m.toString());
        }
    }


}
