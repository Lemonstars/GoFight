package model.thing.step;

import data.NotificationContent;
import model.thing.IThing;
import model.thing.hero.AbstractHero;
import model.thing.hero.mediator.IColleague;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/24
 */
public interface IStep extends IThing, IColleague{

    @Override
    default void mediate(AbstractHero hero, int newX, int newY, NotificationContent notificationContent) {
        step(hero);
        notificationContent.setFloorChanged(true);
        notificationContent.setRoleChanged(true);
    }

    /**
     * 跨楼层
     * @param hero
     */
    void step(AbstractHero hero);

}
