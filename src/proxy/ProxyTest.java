package proxy;

/**
 * @author liangxiong
 * @date 2019-11-17 09:25
 * @description
 **/
public class ProxyTest {

    public static void main(String[] args) {
        Printable proxy = new PrinterProxy("Alice");
        System.out.println("代理类名称: " + proxy.getPrinterName());
        proxy.setPrinterName("Bob");
        System.out.println("代理类名称: " + proxy.getPrinterName());
        proxy.print("Hello,World");
    }
}
