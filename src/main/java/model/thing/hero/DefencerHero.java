package model.thing.hero;


/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class DefencerHero extends AbstractHero {

    @Override
    void initRole() {
        this.attack = 10;
        this.defence = 12;
        this.blood = 100;
        this.description = "防守者";
    }

}
