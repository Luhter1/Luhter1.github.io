package en;

public enum LandType{
    NONE("None"),
    UP("возвышенность"),
    DOWN("низменность"),
    ILLUSION("иллюзорность");

    private String LT;

    LandType(String LT){
        this.LT = LT;     
    }

    public String getContent(){return LT;}
}
