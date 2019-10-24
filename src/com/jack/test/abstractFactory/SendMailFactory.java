/**
 * FileName: SendMailFactory
 * Author:   huang.yj
 * Date:     2019/10/24 14:05
 * Description: 工厂类实现类1
 */
package com.jack.test.abstractFactory;

/**
 * 〈工厂类实现类1〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class SendMailFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}