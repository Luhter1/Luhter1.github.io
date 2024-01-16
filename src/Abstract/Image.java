package Abstract;

import en.LandType;
import java.util.Objects;

public abstract class Image{
        protected String lookAs;
        protected LandType landType;
        
        public Image(String L, LandType T){
            this.lookAs = L;
            this.landType = T;            
        }
        
        public abstract String content();     

        @Override    
        public boolean equals(Object o){
            if(this==o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Image actor = (Image) o;
            return Objects.equals(this.toString(), actor.toString());
        }
        
        @Override
        public int hashCode(){
            return Objects.hash(lookAs) + Objects.hash(landType) + 1;
        }

        @Override
        public String toString(){
            return this.getClass().getSimpleName()+"."+lookAs;
        }
}
