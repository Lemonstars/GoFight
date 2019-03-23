package model.thing.self;

import model.thing.IThing;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public interface ISelf extends IThing{

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
