package model.thing.hero;

import data.NotificationContent;
import model.floor.Floor;
import model.thing.IThing;
import model.thing.ThingType;
import model.thing.door.IDoor;
import model.thing.key.IKey;
import model.thing.monster.AbstractMonster;
import model.thing.self.ISelf;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class ConcreteMeetMediator implements IMeetMediator{

    @Override
    public void meet(AbstractHero hero, IThing thing, int newX, int newY) {
        // go beyond the range of the map
        Floor floor = hero.getFloor();
        boolean isValid = floor.isValidLocation(newX, newY);
        if(!isValid){
            return;
        }

        // if the new location is the wall
        ThingType type = thing.getThingType();
        if(type == ThingType.WALL){
            return;
        }

        int currentX = hero.getCurrentX();
        int currentY = hero.getCurrentY();
        NotificationContent notificationContent = new NotificationContent(currentX, currentY, newX, newY);
        if(thing instanceof IKey){
            notificationContent.setKeyChanged(true);
            ((IKey)thing).increaseKey(hero);
        }else if(thing instanceof IDoor){
            boolean changed = ((IDoor)thing).decreaseKey(hero);
            notificationContent.setKeyChanged(changed);
        }else if(thing instanceof ISelf){
            notificationContent.setRoleChanged(true);
            ((ISelf)thing).benefit(hero);
        }else if(thing instanceof AbstractMonster){
            boolean changed = ((AbstractMonster)thing).attack(hero);
            notificationContent.setRoleChanged(changed);
        }
        // todo 楼梯

        hero.moveTo(newX, newY);
        hero.notifyObserverChanged(notificationContent);
    }
}
