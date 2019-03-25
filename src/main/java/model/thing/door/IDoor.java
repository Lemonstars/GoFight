package model.thing.door;

import data.NotificationContent;
import model.thing.IThing;
import model.thing.hero.AbstractHero;
import model.thing.hero.mediator.IColleague;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public interface IDoor extends IThing, IColleague{

    @Override
    default void mediate(AbstractHero hero, int newX, int newY, NotificationContent notificationContent) {
        boolean changed = decreaseKey(hero);
        notificationContent.setKeyChanged(changed);
        hero.moveTo(newX, newY);
    }

    /**
     * 减少英雄的钥匙数
     * @param hero
     * @return
     */
    boolean decreaseKey(AbstractHero hero);

}
