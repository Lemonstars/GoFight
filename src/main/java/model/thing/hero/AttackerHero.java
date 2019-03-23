package model.thing.hero;

import model.floor.FloorFactory;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class AttackerHero extends AbstractHero{

    public AttackerHero(FloorFactory floorFactory) {
        super(floorFactory);
    }

    @Override
    void initRole() {
        this.attack = 12;
        this.defence = 10;
        this.blood = 100;
        this.description = "攻击者";
    }

}
