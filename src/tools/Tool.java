package tools;

import characters.Human;
import places.Door;

public class Tool extends Item implements doorOpener{
    private boolean canOpenDoor = false;
    private String name;
    public Tool(String n){
        super(n);
    }
    public Tool(String name, boolean ability){
        super(name);
        this.canOpenDoor = ability;
    }
    public void use(Human human, Door door){
        door.unlock(this);
        System.out.println(this.getName() + " используется на " + door.getName());
    }
    public boolean canOpenDoor(){
        return canOpenDoor;
    }
}
