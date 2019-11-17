package proxy;

import java.util.concurrent.TimeUnit;

/**
 * @author liangxiong
 * @date 2019-11-17 09:11
 * @description 打印机的具体实现类
 **/
public class Printer implements Printable {

    /**
     * 打印机名称
     */
    private String name;

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer实例生成中...");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String message) {
        System.out.println("===" + name + "===");
        System.out.println(message);
    }

    /**
     * 干重活
     *
     * @param message
     */
    private void heavyJob(String message) {
        System.out.println(message);
        int size = 5;
        try {
            for (int i = 0; i < size; i++) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(".");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
    }
}
