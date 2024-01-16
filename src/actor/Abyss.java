package actor;

import Interface.Land;
import en.LandType;
import java.util.Objects;
import java.util.ArrayList;
import java.lang.Math;
import java.util.List;

public class Abyss implements Land{
    String L;
    LandType T;

    public Abyss(String L, LandType T){
        this.L = L;
        this.T = T;
        System.out.println("\nInitialized: "+this.toString()+"\n");
    }

    public String lookAs(){return L;}

    public LandType landType(){return T;}

    public void mix(String ...args){
        String end="";
        for(int i=0; i<args.length;i++){
            end += args[i];
        } 
        this.shuffle(end);
    }

    private void shuffle(String input){
        List<Character> characters = new ArrayList<Character>();
        for(char c:input.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        System.out.println(L + ":Mix " + output.toString());
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
        return Objects.hash(L) + Objects.hash(T) +1;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+"."+L;
    } 
}
