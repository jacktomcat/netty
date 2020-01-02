package com.chsoft.netty;
import org.junit.*;


public class NettyTest {


    /**
     * https://blog.csdn.net/tanqian351/article/details/83900308
     *
     * https://www.jianshu.com/p/5dcbc0456376
     *
     *
     * https://blog.csdn.net/zhengyangzkr/article/details/71512277
     * https://blog.csdn.net/iteye_804/article/details/82681770
     * https://www.iteye.com/blog/liao492006-1820271  (Group)
     */

    @Test
    public void test() {
        NettyTelnetServer nettyTelnetServer = new NettyTelnetServer();
        try {
            nettyTelnetServer.open();
        } catch (InterruptedException e) {
            nettyTelnetServer.close();
        }
    }


}
