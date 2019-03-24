package model.floor;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/20
 */
public class Floor3 extends Floor{

    public Floor3(String floorFile, int level) {
        super(floorFile, level);
    }

    @Override
    public int getStartX() {
        return 1;
    }

    @Override
    public int getStartY() {
        return 0;
    }
}
