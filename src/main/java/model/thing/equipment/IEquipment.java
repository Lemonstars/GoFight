package model.thing.equipment;

import data.NotificationContent;
import model.thing.IThing;
import model.thing.hero.AbstractHero;
import model.thing.hero.mediator.IColleague;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/24
 */
public interface IEquipment extends IThing, IColleague{

    @Override
    default void mediate(AbstractHero hero, int newX, int newY, NotificationContent notificationContent) {
        hero.equip(this);
        notificationContent.setEquipmentChanged(true);
        hero.moveTo(newX, newY);
    }
}
