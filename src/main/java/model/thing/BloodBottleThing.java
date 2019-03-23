package model.thing;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class BloodBottleThing implements IThing{

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
