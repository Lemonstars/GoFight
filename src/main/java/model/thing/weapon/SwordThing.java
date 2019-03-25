package model.thing.weapon;

import data.NotificationContent;
import model.thing.ThingType;
import model.thing.hero.AbstractHero;
import model.thing.hero.decorator.SwordDecorator;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/25
 */
public class SwordThing implements IWeapon{

    @Override
    public void mediate(AbstractHero hero, int newX, int newY, NotificationContent content) {
        hero.acquireWeapon(this);
        hero.moveTo(newX, newY);
        hero = new SwordDecorator(hero);
        hero.initRole();
        content.setHero(hero);
        content.setRoleChanged(true);
        content.setDecorated(true);
        content.setWeaponChanged(true);
        hero.notifyObserverChanged(content);
    }

    @Override
    public String getPicName() {
        return "sword.png";
    }

    @Override
    public String getDescription() {
        return "绝剑";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.SWORD;
    }
}
