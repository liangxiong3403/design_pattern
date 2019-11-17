package composite;

/**
 * @author liangxiong
 * @Date:2019/9/24
 * @Time:14:44
 * @Description 文件操作异常
 */
public class FileTreatmentException extends RuntimeException {

    public FileTreatmentException() {
    }

    public FileTreatmentException(String message) {
        super(message);
    }
}
