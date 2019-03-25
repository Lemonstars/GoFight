package model.thing.hero.mediator;

import data.NotificationContent;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/25
 */
public interface IColleague {

    /**
     * 中介方法
     * @param hero
     * @param newX
     * @param newY
     * @param content
     */
    void mediate(AbstractHero hero, int newX, int newY, NotificationContent content);

}
