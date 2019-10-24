/**
 * FileName: SmsSender
 * Author:   huang.yj
 * Date:     2019/10/24 10:11
 * Description: 接口的实现类2
 */
package com.jack.test.commonFactoryMethod;

/**
 * 〈接口的实现类2〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}