package model.floor;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/19
 */
public class Floor1 extends Floor{

    public Floor1(String floorFile) {
        super(floorFile);
    }

    @Override
    public int getStartX() {
        return 9;
    }

    @Override
    public int getStartY() {
        return 19;
    }
}
