package model.floor;

/**
 * @author 刘兴
 * @version 1.0
 * @date 2019/03/20
 */
public class Floor2 extends Floor {

    public Floor2(String floorFile, int level) {
        super(floorFile, level);
    }

    @Override
    public int getStartX() {
        return 0;
    }

    @Override
    public int getStartY() {
        return 1;
    }
}
