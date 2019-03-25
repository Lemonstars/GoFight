package model.thing.basic;

import data.NotificationContent;
import model.thing.IThing;
import model.thing.ThingType;
import model.thing.hero.AbstractHero;
import model.thing.hero.mediator.IColleague;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class TileThing implements IThing, IColleague {

    @Override
    public void mediate(AbstractHero hero, int newX, int newY, NotificationContent content) {
        hero.moveTo(newX, newY);
    }

    @Override
    public String getPicName() {
        return "tile.png";
    }

    @Override
    public String getDescription() {
        return "tile";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.TILE;
    }
}
