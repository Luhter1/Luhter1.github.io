package action;

import actor.Plane;

public class Time{

    public static void wait(Plane a, int t){
        System.out.println("\nTime.wait in progress...\n");
        a.setDistance(a.getSpeed()*t+a.getDistance());
    }
}
