package actor;

import en.LandType;
import Interface.*;
import Abstract.Image;
import java.util.Objects;

public class People extends Person implements Feelable{ 
    boolean feel = false;     

    public People(String name){
        super(name);    
    }

    public void run(String object){
        System.out.println(name + ":run to " + object);
    }

    public boolean isConsider(Plane P, Land L){
        //если видно, реализуем see
        if(P.getDistanceTo(L) == "большая"){
            System.out.println(name + " is not Consider " + L.toString() + " from " + P.toString());
        }else{
            System.out.println(name + " is Consider " + L.toString() + " from " + P.toString());

            System.out.println(this.see(L).content());

            return true;
        }
        return false;
    }

    public void seePart(Land V, Plane P, Land L){
            if (this.isConsider(P, L)){
                  System.out.println(this.see(V).content());  
            }
    }
    
    public Image feel(Feel a, Land m, Land O){
        class ImageR extends Image{
            
            ImageR(String L, LandType T){super(L, T);}

            public String content(){
                return name + ":feel " + lookAs + " because of " + m.lookAs() + "(" + m.landType()  + ") and " + O.lookAs() + "(" +O.landType() + ")";
            }       
        }
        this.feel=true;
        return new ImageR(a.lookAs(), LandType.NONE);
    }

    public boolean getFeel(){return feel;}
    
    @Override
    public int hashCode(){
        return Objects.hash(name) + Objects.hash(feel) + 1;
    }

 
}
