package model.thing.hero.mediator;

import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 * @usage 中介者模式，对于英雄和系统物件之间进行中介
 */
public interface IMeetMediator {

    /**
     * 英雄和物件相遇
     * @param hero
     * @param newX
     * @param newY
     */
    void meet(AbstractHero hero, int newX, int newY);

}
