package model.thing.key;

import model.thing.IThing;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public interface IKey extends IThing{

    /**
     * 增加英雄的钥匙数
     * @param hero
     */
    void increaseKey(AbstractHero hero);
}
