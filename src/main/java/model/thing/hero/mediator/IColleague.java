package model.thing.hero.mediator;

import data.NotificationContent;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/25
 */
public interface IColleague {

    void mediate(AbstractHero hero, int newX, int newY, NotificationContent content);

}
