package model.thing.hero;

import data.NotificationContent;
import model.floor.Floor;
import model.thing.IThing;
import model.thing.ThingType;
import model.thing.basic.TileThing;
import model.thing.door.IDoor;
import model.thing.equipment.IEquipment;
import model.thing.key.IKey;
import model.thing.monster.AbstractMonster;
import model.thing.self.ISelf;
import model.thing.step.IStep;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public class ConcreteMeetMediator implements IMeetMediator{

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
        if(thing instanceof TileThing){
            hero.moveTo(newX, newY);
        }else if(thing instanceof IKey){
            ((IKey)thing).increaseKey(hero);
            notificationContent.setKeyChanged(true);
            hero.moveTo(newX, newY);
        }else if(thing instanceof IDoor){
            boolean changed = ((IDoor)thing).decreaseKey(hero);
            notificationContent.setKeyChanged(changed);
            hero.moveTo(newX, newY);
        }else if(thing instanceof ISelf){
            notificationContent.setRoleChanged(true);
            ((ISelf)thing).benefit(hero);
            hero.moveTo(newX, newY);
        }else if(thing instanceof AbstractMonster){
            boolean changed = ((AbstractMonster)thing).attack(hero);
            notificationContent.setRoleChanged(changed);
            hero.moveTo(newX, newY);
        }else if(thing instanceof IStep) {
            ((IStep)thing).step(hero);
            notificationContent.setFloorChanged(true);
            notificationContent.setRoleChanged(true);
        }else if(thing instanceof IEquipment){
            hero.equip((IEquipment)thing);
            notificationContent.setEquipmentChanged(true);
        }

        hero.notifyObserverChanged(notificationContent);
    }
}
