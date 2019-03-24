package model.thing.hero;

import model.floor.Floor;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class AttackerHero extends AbstractHero{

    public AttackerHero(Floor floor) {
        super(floor);
    }

    @Override
    void initRole() {
        this.attack = 15;
        this.defence = 10;
        this.blood = 200;
        this.description = "攻击者";
    }

}
