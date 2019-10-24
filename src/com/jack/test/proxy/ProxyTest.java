/**
 * FileName: ProxyTest
 * Author:   huang.yj
 * Date:     2019/10/24 17:22
 * Description: 测试类
 */
package com.jack.test.proxy;

/**
 * 〈测试类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}