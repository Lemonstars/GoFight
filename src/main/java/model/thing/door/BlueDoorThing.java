package model.thing.door;

import model.thing.ThingType;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class BlueDoorThing implements IDoor {

    @Override
    public boolean decreaseKey(AbstractHero hero) {
        int currentNum = hero.getKeyBlue();
        if(currentNum > 0){
            hero.decreaseBlueKey();
            return true;
        }

        return false;
    }

    @Override
    public String getPicName() {
        return "door-blue.png";
    }

    @Override
    public String getDescription() {
        return "blue door";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.DOOR_BLUE;
    }
}
