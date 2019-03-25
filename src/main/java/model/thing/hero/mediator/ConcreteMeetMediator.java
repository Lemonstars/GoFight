package model.thing.hero.mediator;

import data.NotificationContent;
import model.floor.Floor;
import model.thing.IThing;
import model.thing.ThingType;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class ConcreteMeetMediator implements IMeetMediator {

    @Override
    public void meet(AbstractHero hero, int newX, int newY) {
        // go beyond the range of the map
        Floor floor = hero.getFloor();
        boolean isValid = floor.isValidLocation(newX, newY);
        if(!isValid){
            return;
        }

        // if the new location is the wall
        IThing thing = floor.getThingType(newX, newY);
        ThingType type = thing.getThingType();
        if(type == ThingType.WALL){
            return;
        }

        int currentX = hero.getCurrentX();
        int currentY = hero.getCurrentY();
        NotificationContent notificationContent = new NotificationContent(currentX, currentY, newX, newY);
        if(thing instanceof IColleague){
            ((IColleague)thing).mediate(hero, newX, newY, notificationContent);
        }

    }
}
