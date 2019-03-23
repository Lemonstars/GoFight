package model.thing.monster;

import model.thing.IThing;
import model.thing.hero.AbstractHero;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public abstract class AbstractMonster implements IThing{

    protected int attack;
    protected int defence;
    protected int blood;
    protected int money;
    protected int experience;

    public AbstractMonster() {
        initBasicInfo();
    }

    public boolean attack(AbstractHero hero){
         int heroBlood = hero.getBlood();
         int heroAttack = hero.getAttack();
         int heroDefence = hero.getDefence();

         int heroHarmPerRound = heroAttack - getDefenceNum();
         if(heroHarmPerRound <= 0){
             return false;
         }

         int monsterBlood = blood;
         int monsterHarmPerRound = getAttackNum() - heroDefence;
         while (monsterBlood > 0){
             monsterBlood -= heroHarmPerRound;
             heroBlood -= monsterHarmPerRound;
             if(heroBlood <= 0){
                 return false;
             }
         }

         hero.setBlood(heroBlood);
         hero.increaseMoney(getMoney());
         hero.increaseExperience(getExperience());

         return true;
     }

    /**
     * 初始化数值
     */
    abstract void initBasicInfo();

     int getAttackNum(){
         return attack;
     }

     int getDefenceNum(){
        return defence;
     }

     int getBlood(){
        return blood;
     }

     int getExperience(){
        return experience;
     }

     int getMoney(){
        return money;
     }

}
