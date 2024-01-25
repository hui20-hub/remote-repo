package github.com.tang;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @Title: test
 * @Author hui20-hub
 * @Package github.com.tang
 * @Date 2024/1/24 18:35
 */

public class test {
    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor=new BasicTextEncryptor();
        textEncryptor.setPassword("hui20-hub");
        String userName=textEncryptor.encrypt("root");
        String passWord=textEncryptor.encrypt("000000");
        System.out.println("userName="+userName);
        System.out.println("password="+passWord);
    }
}