package model.thing.key;

import data.NotificationContent;
import model.thing.IThing;
import model.thing.hero.AbstractHero;
import model.thing.hero.mediator.IColleague;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public interface IKey extends IThing, IColleague{

    @Override
    default void mediate(AbstractHero hero, int newX, int newY, NotificationContent content) {
        increaseKey(hero);
        content.setKeyChanged(true);
        content.setHero(hero);
        hero.moveTo(newX, newY);
        hero.notifyObserverChanged(content);
    }

    /**
     * 增加英雄的钥匙数
     * @param hero
     */
    void increaseKey(AbstractHero hero);
}
