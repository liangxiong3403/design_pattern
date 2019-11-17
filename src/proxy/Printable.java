package proxy;

/**
 * @author liangxiong
 * @date 2019-11-17 09:10
 * @description 可打印地
 **/
public interface Printable {

    /**
     * 设置打印机名称
     *
     * @param name 打印机名称
     */
    void setPrinterName(String name);

    /**
     * 获取打印机名称
     *
     * @return
     */
    String getPrinterName();

    /**
     * 打印文字
     *
     * @param message 待打印文本
     */
    void print(String message);
}
