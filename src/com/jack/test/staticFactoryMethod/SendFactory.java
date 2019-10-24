/**
 * FileName: SendFactory
 * Author:   huang.yj
 * Date:     2019/10/24 11:16
 * Description: 静态工厂类
 */
package com.jack.test.staticFactoryMethod;

/**
 * 〈静态工厂类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class SendFactory {
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }
}