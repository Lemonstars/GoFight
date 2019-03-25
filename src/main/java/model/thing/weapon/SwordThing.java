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
        AbstractHero notDecoratedHero = hero;
        hero.moveTo(newX, newY);
        hero = new SwordDecorator(hero);

        // todo not decorate
        hero.initRole();
        content.setHero(hero);
        content.setRoleChanged(true);
        notDecoratedHero.notifyObserverChanged(content);
    }

    @Override
    public String getPicName() {
        return "sword.png";
    }

    @Override
    public String getDescription() {
        return "sword";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.SWORD;
    }
}
