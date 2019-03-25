package model.thing.hero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class AttackerHero extends AbstractHero{

    @Override
    public void initRole() {
        this.level = 1;
        this.attack = 18;
        this.defence = 10;
        this.blood = 500;
        this.description = "攻击者";
    }

}
