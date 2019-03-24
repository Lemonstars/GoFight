package model.thing.equipment;

import model.thing.ThingType;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/24
 */
public class BookThing implements IEquipment {

    @Override
    public String getPicName() {
        return "book.png";
    }

    @Override
    public String getDescription() {
        return "通天书";
    }

    @Override
    public ThingType getThingType() {
        return ThingType.BOOK;
    }
}
