/**
 * FileName: Test
 * Author:   huang.yj
 * Date:     2019/10/24 14:09
 * Description: 测试类
 */
package com.jack.test.abstractFactory;

/**
 * 〈测试类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}