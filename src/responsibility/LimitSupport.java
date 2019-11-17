package responsibility;

/**
 * @author liangxiong
 * @date 2019-11-10 19:41
 * @description 解决编号小于limit值的问题
 **/
public class LimitSupport extends Support {

    /**
     * 阈值,小于这个阈值的问题才解决
     */
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() < limit) {
            return true;
        }
        return false;
    }
}
