package model.monster;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public interface IMonster {

    /**
     * 获取攻击值
     * @return
     */
    int getAttackNum();

    /**
     * 获取防守值
     * @return
     */
    int getDefenceNum();

    /**
     * 获取血量
     * @return
     */
    int getBlood();

    /**
     * 战胜后的经验值
     * @return
     */
    int getExperience();

    /**
     * 战胜后的金币
     * @return
     */
    int getMoney();

}
