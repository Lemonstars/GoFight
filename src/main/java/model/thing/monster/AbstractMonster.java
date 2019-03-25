package model.thing.monster;

import data.NotificationContent;
import model.thing.IThing;
import model.thing.hero.AbstractHero;
import model.thing.hero.mediator.IColleague;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/21
 */
public abstract class AbstractMonster implements IThing, IColleague{

    protected int attack;
    protected int defence;
    protected int blood;
    protected int money;
    protected int experience;

    public AbstractMonster() {
        initBasicInfo();
    }

    @Override
    public void mediate(AbstractHero hero, int newX, int newY, NotificationContent notificationContent) {
        boolean changed = attack(hero);
        notificationContent.setRoleChanged(changed);
        hero.moveTo(newX, newY);
    }

    public boolean attack(AbstractHero hero){
         int heroBlood = hero.getBlood();
         int heroAttack = hero.getAttack();
         int heroDefence = hero.getDefence();

         // 如果英雄攻击力小于怪物防御力，则无法攻击
         int heroHarmPerRound = heroAttack - getDefenceNum();
         if(heroHarmPerRound <= 0){
             return false;
         }

         // 如果英雄对怪物的伤害为正，同时怪物对英雄没有伤害，则直接增加金币和经验
         int monsterHarmPerRound = getAttackNum() - heroDefence;
         if(monsterHarmPerRound <= 0){
             hero.increaseMoney(getMoney());
             hero.increaseExperience(getExperience());
             return true;
         }

         // 真实对战，若英雄血量先不大于0，则无法对战
         int monsterBlood = blood;
         while (monsterBlood > 0){
             monsterBlood -= heroHarmPerRound;
             heroBlood -= monsterHarmPerRound;
             if(heroBlood <= 0){
                 return false;
             }
         }

         // 英雄战胜怪物，更新血量、金币和经验
         hero.setBlood(heroBlood);
         hero.increaseMoney(getMoney());
         hero.increaseExperience(getExperience());
         return true;
     }

    /**
     * 初始化数值
     */
    abstract void initBasicInfo();

     public int getAttackNum(){
         return attack;
     }

     public int getDefenceNum(){
        return defence;
     }

     public int getBlood(){
        return blood;
     }

     public int getExperience(){
        return experience;
     }

     public int getMoney(){
        return money;
     }

}
