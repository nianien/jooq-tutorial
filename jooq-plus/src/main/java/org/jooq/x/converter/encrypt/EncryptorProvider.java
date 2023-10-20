package org.jooq.x.converter.encrypt;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

/**
 * 加密算法加载服务
 * Created on 2022/2/18
 *
 * @author liyifei
 */
public class EncryptorProvider {

    private static Encryptor encryptor;

    static {
        ServiceLoader<Encryptor> encryptors = ServiceLoader.load(Encryptor.class);
        List<Encryptor> list = new ArrayList<>();
        encryptors.iterator().forEachRemaining(list::add);
        for (Encryptor encryptor : list) {
            System.out.println("==>loaded encryptor: " + encryptor.getClass());
        }
        encryptor = list.stream().sorted().findFirst().get();
    }

    /**
     * 获取加密对象
     *
     * @return
     */
    public static Encryptor get() {
        return encryptor;
    }

}
