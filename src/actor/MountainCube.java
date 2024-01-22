package actor;

import Interface.Land;
import en.LandType;
import java.util.Objects;

public class MountainCube implements Land{
    String L;
    LandType T;

    public MountainCube(String L, LandType T){
        this.L = L;
        this.T = T;
        System.out.println("\nInitialized: " + this.toString() +"\n");
    }

    public String lookAs(){return L;}

    public LandType landType(){return T;}

    @Override    
    public boolean equals(Object o){
        if(this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Land actor = (Land) o;
        return Objects.equals(L, actor.lookAs());
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(L) + Objects.hash(T) +10;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+"."+L;
    } 
}
