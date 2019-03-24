package model.thing.step;

import model.thing.IThing;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/24
 */
public interface IStep extends IThing{

    /**
     * 跨楼层
     * @param hero
     */
    void step(AbstractHero hero);

}
