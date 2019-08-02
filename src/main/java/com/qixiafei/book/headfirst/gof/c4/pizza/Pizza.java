package com.qixiafei.book.headfirst.gof.c4.pizza;

/**
 * <P>Description: 披萨基类. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 13:50</P>
 * <P>UPDATE AT: 2019/3/11 13:50</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public interface Pizza {

    void prepare();

    void bake();

    void cut();

    void box();
}
