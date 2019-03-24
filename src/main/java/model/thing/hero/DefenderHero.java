package model.thing.hero;


import model.floor.Floor;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class DefenderHero extends AbstractHero {

    public DefenderHero(Floor floor) {
        super(floor);
    }

    @Override
    void initRole() {
        this.attack = 12;
        this.defence = 15;
        this.blood = 200;
        this.description = "防守者";
    }

}
