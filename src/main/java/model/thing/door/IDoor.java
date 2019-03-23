package model.thing.door;

import model.thing.IThing;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public interface IDoor extends IThing{

    /**
     * 减少英雄的钥匙数
     * @param hero
     * @return
     */
    boolean decreaseKey(AbstractHero hero);

}
