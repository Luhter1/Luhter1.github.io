import actor.*;
import en.LandType;
import Interface.*;
import action.*;
import except.*;
import java.util.Scanner;

public class main{
	
	public static void main(String[] args){

        Larcen larcen = new Larcen("матрос");
        Land K = new Land(){
            @Override
            public String lookAs(){return "кратеры";}

            @Override
            public LandType landType(){return LandType.DOWN;}      
        };
        System.out.println(larcen.see(K).content());

        Land V = new Land(){
            @Override
            public String lookAs(){return "вершины";}

            @Override
            public LandType landType(){return LandType.UP;}      
        };
        System.out.println(larcen.see(V).content());

        larcen.say(110);

        People people = new People("people");
        people.run("эллюминаторы");

        Plane plane = new Plane("plane", 0);
        Scanner in = new Scanner(System.in);
        System.out.print("Set speed: ");
        int speed = in.nextInt();

        for(int i=0; i<2; i++){
            try{
                plane.setSpeed(speed);
                break;
            }catch(PlaneMaxSpeedException e){
                System.out.println(e.toString());
                System.out.println("Изменяем скорость самолета до скорости истребителя");
                speed = 8100;
            }
        }

        Mountain mountain = new Mountain("mountain", LandType.UP, 1000);
        plane.getSpeed();

        try{
        plane.approach(mountain);
        people.seePart(V, plane, mountain);
        Time.wait(plane, 1);
        plane.approach(mountain);
        people.seePart(V, plane, mountain);
        
        Feel W = new Feel(){
                @Override
                public String lookAs(){return "wonder";}
            };
        Land O = new Land(){
                @Override
                public String lookAs(){return "облако";}

                @Override
                public LandType landType(){return LandType.NONE;}    
            };
        System.out.println(people.feel(W, mountain, O).content());

        Mystery mystery = new Mystery("тайна");
        mystery.isGoingToOpen();
        Paint.born(people, mystery);
        mystery.isGoingToOpen();

        Abyss abyss = new Abyss("бездна", LandType.ILLUSION);
        abyss.mix("время", "пространство", "измерения");

        Person person = new Person("author");
        System.out.println(person.see(mountain).content());
        ReceptacleOfEvil RE = new ReceptacleOfEvil("вместилище_зла", LandType.ILLUSION);
        System.out.println(person.see(RE).content());
        System.out.println(RE.toString() + " is equals to " + mountain.toString() + ": " +RE.equals(mountain));
    
        Land DW = new Land(){
                {
                    System.out.println("\nInitialized: "+this.toString()+"\n");
                    System.out.println(person.see(this).content());
                    this.start();
                }
                @Override
                public String lookAs(){return "мир_смерти";}

                @Override
                public LandType landType(){return LandType.ILLUSION;}    
        
                public void start(){System.out.println(this.toString() + ":start");}
            
                @Override
                public String toString(){
                    return "DeathWorld.мир_смерти";
                }
        };
        
        MountainCube M_C = new MountainCube("cubes", LandType.UP);
        Danfort D = new Danfort("Danfort");
        D.makeSee(people, M_C);

        Rerich R = new Rerich("rerich");
        Land P_T = R.paint("Asia");
        System.out.println(P_T.equals(M_C));
    
        Area A = new Area("Континент", LandType.DOWN);
        A.hasPartOfArt(R);
        
        }catch(ZeroSpeedException e){
            System.out.println(e.toString());        
        }
        
    }
}


























