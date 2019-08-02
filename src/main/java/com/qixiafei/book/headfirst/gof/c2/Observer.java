package com.qixiafei.book.headfirst.gof.c2;

/**
 * <P>Description: 观察者. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/6 14:27</P>
 * <P>UPDATE AT: 2019/3/6 14:27</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public interface Observer {

    /**
     * 更新观者者数据.
     *
     * @param temp     温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);
}
