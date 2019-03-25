package model.thing.shop;

import data.NotificationContent;
import model.thing.IThing;
import model.thing.ThingType;
import model.thing.hero.AbstractHero;
import model.thing.hero.mediator.IColleague;
import ui.dialog.ExperienceShopDialog;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/25
 */
public class ExperienceShop implements IThing, IColleague {

    @Override
    public void mediate(AbstractHero hero, int newX, int newY, NotificationContent content) {
        new ExperienceShopDialog(getDescription(), hero);
        content.setRoleChanged(true);
        content.setHero(hero);
        content.setShop(true);
        hero.notifyObserverChanged(content);
    }

    @Override
    public String getPicName() {
        return "shop.png";
    }

    @Override
    public String getDescription() {
        return "经验商店";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.SHOP;
    }
}
