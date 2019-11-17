package responsibility;

/**
 * @author liangxiong
 * @date 2019-11-10 19:47
 * @description 解决特定编号的问题
 **/
public class SpecialSupport extends Support {

    /**
     * 指定编号
     */
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        }
        return false;
    }
}
