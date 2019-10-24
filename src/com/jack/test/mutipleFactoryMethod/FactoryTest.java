/**
 * FileName: FactoryTest
 * Author:   huang.yj
 * Date:     2019/10/24 10:14
 * Description: 测试类
 */
package com.jack.test.mutipleFactoryMethod;


/**
 * 〈测试类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.Send();
    }
}