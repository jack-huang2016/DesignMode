/**
 * FileName: SendFactory
 * Author:   huang.yj
 * Date:     2019/10/24 10:14
 * Description: 工厂类
 */
package com.jack.test.commonFactoryMethod;

/**
 * 〈工厂类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class SendFactory {
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}