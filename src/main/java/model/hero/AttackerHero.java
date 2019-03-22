package model.hero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class AttackerHero extends AbstractHero{

    @Override
    void initRole() {
        this.attack = 12;
        this.defence = 10;
        this.blood = 100;
        this.description = "攻击者";
    }

}
