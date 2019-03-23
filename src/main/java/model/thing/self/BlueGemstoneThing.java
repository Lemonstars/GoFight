package model.thing.self;

import model.thing.ThingType;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class BlueGemstoneThing implements ISelf {

    @Override
    public void benefit(AbstractHero hero) {
        hero.increaseDefence(getBenefitNum());
    }

    @Override
    public int getBenefitNum() {
        return 2;
    }

    @Override
    public String getPicName() {
        return "gemstone-blue.png";
    }

    @Override
    public String getDescription() {
        return "blue gemstone";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.GEMSTONE_BLUE;
    }
}
