package org.jooq.plus.encryptor;

/**
 * 加密接口定义
 * Created on 2022/2/18
 *
 * @author liyifei
 */
public interface Encryptor extends Comparable<Encryptor> {

    /**
     * 优先级,数值越小优先级越高
     *
     * @return
     */
    default int order() {
        return 0;
    }

    /**
     * 加密字符串
     *
     * @param src
     * @return
     */
    String encrypt(String src);

    /**
     * 解密字符串
     *
     * @param src
     * @return
     */
    String decrypt(String src);


    @Override
    default int compareTo(Encryptor o) {
        return this.order() - o.order();
    }
}
