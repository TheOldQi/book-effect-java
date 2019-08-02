package com.qixiafei.book.headfirst.gof.c5;

/**
 * <P>Description: 单例模式. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 16:27</P>
 * <P>UPDATE AT: 2019/3/11 16:27</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class SingletonClass {

    private static volatile SingletonClass ENTITY = null;

    public static SingletonClass getInstance() {
        if (ENTITY == null) {
            synchronized (SingletonClass.class) {
                if (ENTITY == null) {
                    ENTITY = new SingletonClass();
                }

            }
        }

        return ENTITY;
    }

    private SingletonClass() {
    }


}
