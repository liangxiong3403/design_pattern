package visitor;

/**
 * @author liangxiong
 * @date 2019-11-09 20:58
 * @description 表示数据结构的接口, 接受访问者的访问
 **/
public interface Element {

    /**
     * 接受访问者
     *
     * @param visitor 访问者
     * @throws FileTreatmentException 文件操作异常
     */
    void accept(Visitor visitor) throws FileTreatmentException;
}
