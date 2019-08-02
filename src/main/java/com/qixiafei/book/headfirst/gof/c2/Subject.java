package com.qixiafei.book.headfirst.gof.c2;

/**
 * <P>Description: 主题. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/6 14:27</P>
 * <P>UPDATE AT: 2019/3/6 14:27</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public interface Subject {

    /**
     * 注册观察者.
     *
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 删除观察者.
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者.
     */
    void notifyObservers();
}
