package model.thing.step;

import model.thing.ThingType;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class StepDownThing implements IStep {

    @Override
    public void step(AbstractHero hero) {
        hero.downstairs();
    }

    @Override
    public String getPicName() {
        return "step-down.png";
    }

    @Override
    public String getDescription() {
        return "step down";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.STEP_DOWN;
    }
}
