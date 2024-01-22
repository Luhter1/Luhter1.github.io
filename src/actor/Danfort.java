package actor;

import en.LandType;
import Interface.*;
import Abstract.Image;
import java.util.Objects;

public class Danfort extends Person{ 

    public Danfort(String name){
        super(name);    
    }

    public void makeSee(Person O, Land a){
            System.out.println(O.see(a).content() + " because of " + toString());
    }
    
    
    @Override
    public int hashCode(){
        return Objects.hash(name) + 10;
    }

 
}
