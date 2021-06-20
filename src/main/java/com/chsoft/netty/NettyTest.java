package com.chsoft.netty;
import org.junit.*;


public class NettyTest {


    /**
     * Netty学习路线总结
     * https://blog.csdn.net/tanqian351/article/details/83900308
     *
     *
     * 源码分析
     * https://www.jianshu.com/p/31993e035cb8
     *
     *
     * 需要添加到笔记
     * https://blog.csdn.net/z69183787/article/details/90700209
     *
     *
     * 中文文档
     * https://waylau.gitbooks.io/essential-netty-in-action/GETTING%20STARTED/Writing%20the%20echo%20server.html
     *
     * 进度
     * https://waylau.gitbooks.io/essential-netty-in-action/CORE%20FUNCTIONS/ByteBuf%20-%20The%20byte%20data%20container.html
     *
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
