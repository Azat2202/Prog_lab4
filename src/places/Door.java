package places;

import tools.Tool;

import java.util.concurrent.locks.Condition;

public class Door {
    private String name;
    DoorCondition doorCondition;

    Door(String n){
        name = n;
        doorCondition = DoorCondition.CLOSED;
    }
    public Door(String n, DoorCondition cond){
        name = n;
        doorCondition = cond;
    }

    public void unlock(Tool tool){
        if (tool.canOpenDoor()) {
            changeCondition(DoorCondition.CLOSED);
        }
    }
    public void openDoor(){
        if (doorCondition != DoorCondition.LOCKED){
            changeCondition(DoorCondition.OPEN);
            System.out.println(getName() + " " + DoorCondition.OPEN.name());
        }
    }
    public String getName(){
        return name;
    }
    public void openDoor(DoorCondition cond){
        if (doorCondition != DoorCondition.LOCKED){
            changeCondition(cond);
            System.out.println(this.getName() + cond.name());
        }
    }
    private void changeCondition(DoorCondition cond){
        doorCondition = cond;

    }
    public DoorCondition getCondition(){
        return doorCondition;
    }
}
