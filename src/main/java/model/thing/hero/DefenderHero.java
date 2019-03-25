package model.thing.hero;


/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class DefenderHero extends AbstractHero {

    @Override
    public void initRole() {
        this.level = 1;
        this.attack = 12;
        this.defence = 15;
        this.blood = 200;
        this.description = "防守者";
    }

}
