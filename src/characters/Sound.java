package characters;

public enum Sound {
    BOLT("BOLTING"),
    WISPER("WISPERING"),
    STEPS("STEPPING"),
    GASP("GASPING"),
    SCREAM("SCREAMING"),
    LOUD_SCREAMING("SQUALLING");
    private String sound;
    Sound(String s){
        this.sound = s;
    }
    public String getSound(){
        return this.sound;
    }
}
