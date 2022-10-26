package places;

public enum DoorCondition {
    LOCKED("LOCKED"),
    OPEN("OPEN"),
    CLOSED("CLOSED"),
    AJAR("AJAR");
    private final String condition;
    DoorCondition(String condition){
        this.condition = condition;
    }
    public String getCondition(){
        return this.condition;
    }
}
