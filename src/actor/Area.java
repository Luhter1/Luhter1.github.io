package actor;

import Interface.Land;
import en.LandType;
import java.util.Objects;

public class Area implements Land{
    String L;
    LandType T;

    public Area(String L, LandType T){
        this.L = L;
        this.T = T;
        System.out.println("\nInitialized: " + this.toString() +"\n");
    }

    public String lookAs(){return L;}

    public LandType landType(){return T;}

    public void hasPartOfArt(Person o){
        boolean a = false;
        if (o.getClass().getSimpleName().equals("Rerich")){
               a = true;
    
        }
        System.out.println(toString() + " has something " + o.toString() + ": " + a);
    }

    @Override    
    public boolean equals(Object o){
        if(this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Land actor = (Land) o;
        return Objects.equals(L, actor.lookAs());
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(L) + Objects.hash(T) + 2;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+"."+L;
    } 
}
