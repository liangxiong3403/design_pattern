package responsibility;

/**
 * @author liangxiong
 * @date 2019-11-10 19:29
 * @description 解决问题地抽象类
 **/
public abstract class Support {

    /**
     * 解决问题的实例名称
     */
    private String name;

    /**
     * 下一步处理问题地实例
     */
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        // 返回下一个Support实例
        return next;
    }

    /**
     * 解决问题
     *
     * @param trouble
     */
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    /**
     * 实际判断是否可以解决问题
     *
     * @param trouble
     * @return
     */
    protected abstract boolean resolve(Trouble trouble);

    /**
     * template method
     *
     * @param trouble
     */
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            // 可以解决问题
            done(trouble);
        } else if (next != null) {
            // 不能解决问题,下一个处理者不为空
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved");
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                '}';
    }
}
