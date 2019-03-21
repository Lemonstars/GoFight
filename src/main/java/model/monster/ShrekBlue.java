package model.monster;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public class ShrekBlue implements IMonster{

    @Override
    public int getAttackNum() {
        return 15;
    }

    @Override
    public int getDefenceNum() {
        return 15;
    }

    @Override
    public int getBlood() {
        return 250;
    }

    @Override
    public int getExperience() {
        return 8;
    }

    @Override
    public int getMoney() {
        return 10;
    }
}
