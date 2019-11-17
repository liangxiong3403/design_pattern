package visitor;

/**
 * @author liangxiong
 * @date 2019-11-09 20:58
 * @description 访问者
 **/
public abstract class Visitor {

    /**
     * 访问文件
     *
     * @param file 文件
     */
    public abstract void visit(File file);

    /**
     * 访问文件夹
     *
     * @param directory 文件夹
     * @throws FileTreatmentException 操作异常
     */
    public abstract void visit(Directory directory) throws FileTreatmentException;
}
