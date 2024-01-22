package en;

public enum LandType{
    NONE("None"),
    UP("возвышенность"),
    DOWN("низменность"),
    ILLUSION("иллюзорность"),
    DEFAULT;

    private String LT;

    LandType(String LT){
        this.LT = LT;     
    }
    
    LandType(){this.LT = "default";}
    //принцип инверсии зависимости, как могут создаваться 2 конструктора, как он вызывается

    // ипользуется для инициализации значения переменной, вызывается автоматически при создании каждого элемента перечисления
    // в скобках аргументы конструктора

    // 
    

    public String getContent(){return LT;}
}
