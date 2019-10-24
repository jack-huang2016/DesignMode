/**
 * FileName: SendFactory
 * Author:   huang.yj
 * Date:     2019/10/24 10:37
 * Description: 工厂类
 */
package com.jack.test.mutipleFactoryMethod;

/**
 * 〈工厂类〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class SendFactory {
    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}