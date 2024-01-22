package actor;

import Interface.Land;
import java.util.Objects;
import except.*;

public class Plane{
    private int speed=0; 
    private int distance; 
    private String name;
    private String dis;

    private class Approach{
        int Abs;        
        public Approach(Mountain o){
            this.Abs = Math.abs(distance-o.getCoordinate());
        }
        
        public int Ex(){
            if(speed==0) throw new ZeroSpeedException();
            return Abs/speed;
        }
        
        public String dis(){
            return Abs>=1000 ? "большая" : Abs>=1 ? "маленькая" : "на месте";
        }
    }

    public Plane(String name, int distance){
        this.name = name;
        this.distance = distance;
        System.out.println("\nInitialized: " + this.toString() + "\n");       
    }

    public void setSpeed(int speed) throws PlaneMaxSpeedException{
        if(speed<8200){
        this.speed = speed;
        System.out.println(name + ":speed " + speed);}
        else{
            throw new PlaneMaxSpeedException(speed);
        } 
    }

    public int getSpeed(){  
        if(speed > 500){System.out.println(name+":speed огромная");}
        else if(speed >= 300){System.out.println(name+":speed большая");}
        else if(speed >0){System.out.println(name+":speed маленькая");}
        else{System.out.println(name+":speed не двигается");}
        return speed;
    }

    public void approach(Mountain o){
        Approach A = new Approach(o);
        this.dis = A.dis();
        System.out.println(name + ":approach " + o.lookAs() + " " +(A.Ex() == 1));
    }

    public void setDistance(int a){this.distance = a;}
    public int getDistance(){return distance;}
    
    public String getDistanceTo(Land o){
        System.out.println(name + " distance to " + o.lookAs() + ": " + this.dis); ///////////ошибка, если неопределен dis
        return this.dis;
    }

    @Override    
    public boolean equals(Object o){
        if(this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane actor = (Plane) o;
        return Objects.equals(this.toString(), actor.toString());
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(name) + 1;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName()+"."+name;
    }
    
}
