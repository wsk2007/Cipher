package org.wsk.cipher;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*CaptchaHelper c = new CaptchaHelper();
        c.output(c.getImage() , new FileOutputStream("test.jpg"));
        System.out.println(c.getText());
        ObjectHelper<SecretKeys> o = new ObjectHelper<>();
        o.writeObject(new SecretKeys("a" , "b" , "c") , "test.key");
        SecretKeys s = o.readObject("test.key");
        System.out.println(s.getAES_Key());*/
        FormMain f = new FormMain();
        f.setVisible(true);
        FormCommonDialog d = new FormCommonDialog("hahahahhaha");
        d.setVisible(true);
    }
}
