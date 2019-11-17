package interpreter;

/**
 * @author liangxiong
 * @date 2019-11-17 15:35
 * @description 表示节点地抽象类
 **/
public abstract class Node {

    /**
     * 解析语法
     *
     * @param context 语法解析上下文
     * @throws ParseException 语法解析出现异常
     */
    public abstract void parse(Context context) throws ParseException;

}
