package actor;

import Interface.Imaginationable;
import Abstract.Image;
import Interface.Land;
import en.LandType;
import java.util.Objects;

public class Person implements Imaginationable{
    protected String name;
    
    public Person(String name){
        this.name = name;
        System.out.println("\nInitialized: " + this.toString() + "\n");       
    }
  
    public Image see(Land a){
        // внутренний класс Image передаем на return и вызываем метод
        class ImageR extends Image{
            
            ImageR(String L, LandType T){super(L, T);}

            public String content(){
                return name + ":see " + lookAs + " type of " + landType.getContent();
            }       
        }

        return new ImageR(a.lookAs(), a.landType());
    }

    @Override    
    public boolean equals(Object o){
        if(this==o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person actor = (Person) o;
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
