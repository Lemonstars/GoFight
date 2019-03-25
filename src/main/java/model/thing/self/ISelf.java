package model.thing.self;

import data.NotificationContent;
import model.thing.IThing;
import model.thing.hero.AbstractHero;
import model.thing.hero.mediator.IColleague;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public interface ISelf extends IThing, IColleague{

    @Override
    default void mediate(AbstractHero hero, int newX, int newY, NotificationContent content) {
        content.setRoleChanged(true);
        benefit(hero);
        hero.moveTo(newX, newY);
        content.setHero(hero);
        hero.notifyObserverChanged(content);
    }

    /**
     * 增加英雄的属性值
     * @param hero
     */
    void benefit(AbstractHero hero);

    /**
     * 获取增加数值
     * @return
     */
    int getBenefitNum();
}
