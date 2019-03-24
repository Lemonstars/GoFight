package model.thing.step;

import model.thing.IThing;
import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class StepDownThing implements IThing {

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
