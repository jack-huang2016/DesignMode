/**
 * FileName: MailSender
 * Author:   huang.yj
 * Date:     2019/10/24 10:13
 * Description: 接口的实现类1
 */
package com.jack.test.commonFactoryMethod;

/**
 * 〈接口的实现类1〉
 *
 * @author huang.yj
 * @create 2019/10/24
 * @since 1.0.0
 */
public class MailSender implements Sender{
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}