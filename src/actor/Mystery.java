package actor;

import Interface.Feel;
import java.util.Objects;

public class Mystery implements Feel{
    private String L;  
    private boolean value=false;

    public Mystery(String name){
        this.L = name;
        System.out.println("\nInitialized: Feel.Mystery." + name + "\n");       
    }

    public String lookAs(){return L;}

    public void isGoingToOpen(){
        System.out.println(L+":is_going_to_open " + value);
    }

    public void setMystery(boolean a){
        this.value = a;
    }

    @Override    
    public boolean equals(Object o){
        if(this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feel actor = (Feel) o;
        return Objects.equals(L, actor.lookAs());
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(L) + Objects.hash(value) + 1;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+"."+L;
    }
}
