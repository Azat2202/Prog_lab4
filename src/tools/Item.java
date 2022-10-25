package tools;

import characters.Human;
import places.Door;

public abstract class Items{
    private String name;
    public Items(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object o){
        
    }
}
