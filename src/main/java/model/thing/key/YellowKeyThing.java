package model.thing.key;

import model.thing.ThingType;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class YellowKeyThing implements IKey {

    @Override
    public void increaseKey(AbstractHero hero) {
        hero.increaseYellowKey();
    }

    @Override
    public String getPicName() {
        return "key-yellow.png";
    }

    @Override
    public String getDescription() {
        return "yellow key";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.KEY_YELLOW;
    }
}
