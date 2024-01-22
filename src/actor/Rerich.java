package actor;

import en.LandType;
import Interface.*;
import Abstract.Image;
import java.util.Objects;

public class Rerich extends Person{ 

    public Rerich(String name){
        super(name);    
    }

    public Land paint(String con){
        class PaintOfTemplate implements Land{
            String L;
            LandType T;

            public PaintOfTemplate(String L, LandType T){
                this.L = "template of " + L;
                this.T = T;
                System.out.println("\nInitialized: " + this.toString() +"\n");
            }

            public String lookAs(){return L;}

            public LandType landType(){return T;}

            @Override    
            public boolean equals(Object o){
                if(this==o) return true;
                if (o.getClass().getSimpleName().equals("MountainCube")){
                    System.out.print(toString() + " удачно сравнивается с " + o.toString()+ ": ");
                    return true;
                }
                if (o == null || getClass() != o.getClass()) return false;
                Land actor = (Land) o;
                return Objects.equals(L, actor.lookAs());
            }
            
            @Override
            public int hashCode(){
                return Objects.hash(L) + Objects.hash(T) +14;
            }

            @Override
            public String toString(){
                return this.getClass().getSimpleName()+"."+L;
            }

        }
        return new PaintOfTemplate(con, LandType.DOWN);        
    }


    
    @Override
    public int hashCode(){
        return Objects.hash(name) + 12;
    }

 
}
