package proxy;

/**
 * @author liangxiong
 * @date 2019-11-17 09:16
 * @description 打印机代理类
 **/
public class PrinterProxy implements Printable {

    /**
     * 代理名称
     */
    private String name;

    /**
     * 被代理对象
     */
    private Printable real;

    /**
     * 设置代理类名称
     *
     * @param name
     */
    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            // 设置打印机名称
            this.real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String message) {
        realize();
        this.real.print(message);
    }

    private synchronized void realize() {
        if (real == null) {
            this.real = new Printer(name);
        }
    }
}
