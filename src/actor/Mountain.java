package actor;

import Interface.Land;
import en.LandType;
import java.util.Objects;

public class Mountain implements Land{
    String L;
    LandType T;
    int coordinate;

    public Mountain(String L, LandType T, int coordinate){
        this.L = L;
        this.T = T;
        this.coordinate = coordinate;
        System.out.println("\nInitialized: " + this.toString() +"\n");
    }

    public String lookAs(){return L;}

    public LandType landType(){return T;}

    public int getCoordinate(){return coordinate;}

    @Override    
    public boolean equals(Object o){
        if(this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Land actor = (Land) o;
        return Objects.equals(L, actor.lookAs());
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(L) + Objects.hash(T) + Objects.hash(coordinate) +1;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+"."+L;
    } 
}
