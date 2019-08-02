package com.qixiafei.book.headfirst.gof.c1;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/4 14:21</P>
 * <P>UPDATE AT: 2019/3/4 14:21</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public abstract class Duck {


    /**
     * 飞行行为.
     */
    private FlyBehavior flyBehavior;

    /**
     * 呱呱叫行为.
     */
    private QuackBehavior quackBehavior;

    /**
     * 显示.
     */
    public abstract void display();

    /**
     * 游泳.
     */
    public void swim() {
        System.out.println("每个鸭子都能浮起来，包括诱饵鸭");
    }

    public void setFlyBehavior(final FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(final QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 表演飞翔.
     */
    public void performanceFly() {
        flyBehavior.fly();
    }

    /**
     * 表演呱呱叫.
     */
    public void performanceQuack() {
        quackBehavior.quack();
    }
}
