package strategy;

/**
 * @author liangxiong
 * @Date:2019/9/23
 * @Time:17:00
 * @Description
 */
public interface Strategy {

    /**
     * 获取下一局要出的手势
     *
     * @return
     */
    Hand nextHand();

    /**
     * 根据上一局结果推测下一局应该出什么手势
     *
     * @param win 上一局的手势是否获胜了
     */
    void study(boolean win);
}
