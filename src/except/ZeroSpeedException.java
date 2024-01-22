package except;

public class ZeroSpeedException extends ArithmeticException{
    
    public String toString(){
            return "Самолет не может лететь со скоростью 0.\nЭто все сон, вы спите.";    
    }
}
