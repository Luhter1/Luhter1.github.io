package actor;

import Interface.Land;
import java.util.Objects;

public class Plane{
    private int speed=0; 
    private int distance; 
    private String name;
    private String dis;

    public class Approach{
        int start;        
        public Approach(Mountain o){
            this.start = o.getCoordinate();
        }
        
        public int Ex(){ ///////////////////Ошибка если скорость == 0
            return Math.abs(distance-start)/speed;
        }
        
        public String dis(){
            return Math.abs(distance-start)>=1000 ? "большая" : Math.abs(distance-start)>=1 ? "маленькая" : "на месте";
        }
    }

    public Plane(String name, int distance){
        this.name = name;
        this.distance = distance;
        System.out.println("\nInitialized: " + this.toString() + "\n");       
    }

    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println(name + ":speed " + speed); 
    }

    public int getSpeed(){  
        if(speed > 500){System.out.println(name+":speed огромная");}
        else if(speed >= 300){System.out.println(name+":speed большая");}
        else if(speed>0){System.out.println(name+":speed маленькая");}
        else System.out.println(name+":speed не двигается");
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
