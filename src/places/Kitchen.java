package places;

import characters.Human;

public class Kitchen extends Room{
    private boolean fusePlugs = true;
    public Kitchen(String name){
        super(name);
    }
    public Kitchen(String name, Human[] crowd) {
        super(name, crowd);
    }
    public Kitchen(String name, Human[] crowd, boolean fuses){
        super(name, crowd);
        fusePlugs = fuses;
    }
    public void setFuses(boolean state){
        fusePlugs = state;
    }
    @Override
    public boolean changeLight(Light illumination){
        if(fusePlugs){
            super.changeLight(illumination);
            return true;

        }
        else{
            System.out.println("Не удалось включить свет на " + super.getName());
            return false;
        }
    }
}
