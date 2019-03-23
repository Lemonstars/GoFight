package model.thing.self;

import model.thing.ThingType;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class BloodBottleThing implements ISelf {

    @Override
    public void benefit(AbstractHero hero) {
        hero.increaseBlood(getBenefitNum());
    }

    @Override
    public int getBenefitNum() {
        return 20;
    }

    @Override
    public String getPicName() {
        return "blood.png";
    }

    @Override
    public String getDescription() {
        return "blood";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.BLOOD_BOTTLE;
    }
}
