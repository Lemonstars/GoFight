package model.thing.door;

import model.thing.ThingType;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class YellowDoorThing implements IDoor {

    @Override
    public boolean decreaseKey(AbstractHero hero) {
        int currentNum = hero.getKeyYellow();
        if(currentNum > 0){
            hero.decreaseYellowKey();
            return true;
        }
        return false;
    }


    @Override
    public String getPicName() {
        return "door-yellow.png";
    }

    @Override
    public String getDescription() {
        return "yellow door";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.DOOR_YELLOW;
    }
}
