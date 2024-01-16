package actor;

import Interface.Sayable;
import java.util.Objects;

public class Larcen extends Person implements Sayable{
    private String work;

    public Larcen(String work){
        super("Larcen");
        System.out.println(name + ":work " + work + "\n");        
        this.work = work;
    }    
    
    public void say(int grade){
        String voice;        
        if(grade >= 100){voice = "shout";}
        else if(grade>30){voice = "say";}
        else voice = "whisper";
        System.out.println(name + ":" + voice);
    }

    public void say(String sentence, int grade){
        String voice;        
        if(grade >= 100){voice = "shout";}
        else{voice = "say";}
        System.out.println(name + ":" + voice + " " + sentence);
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(name) + Objects.hash(work) + 1;
    }

}
