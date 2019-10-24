/**
 * FileName: Proxy
 * Author:   huang.yj
 * Date:     2019/10/24 17:21
 * Description: 代理类
 */
package com.jack.test.proxy;

/**
 * 〈代理类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class Proxy implements Sourceable{
    private Source source;

    public Proxy(){
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }

    private void atfer() {
        System.out.println("after proxy!");
    }

    private void before() {
        System.out.println("before proxy!");
    }
}