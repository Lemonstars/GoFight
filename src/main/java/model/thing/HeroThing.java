package model.thing;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class HeroThing implements IThing{

    @Override
    public String getPicName() {
        return "hero.png";
    }

    @Override
    public String getDescription() {
        return "hero";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.HERO;
    }
}
