package model.thing;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/23
 */
public interface IThing {

    /**
     * 获取对应的资源图片的名称
     * @return
     */
    String getPicName();

    /**
     * 获取描述
     * @return
     */
    String getDescription();

    /**
     * 获取类型
     * @return
     */
    ThingType getThingType();

}
