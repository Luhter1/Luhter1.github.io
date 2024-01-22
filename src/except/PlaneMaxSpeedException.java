package except;

public class PlaneMaxSpeedException extends Exception{
    int speed;

    public PlaneMaxSpeedException(int s){speed = s;}
    
    public String toString(){
        if(speed<28500){
            return "Plain's speed="+speed+" is impossible for today" ;
        }else{
            return "Наверно, вы перепутали самолет и ракету.";    
        }
    }
}
