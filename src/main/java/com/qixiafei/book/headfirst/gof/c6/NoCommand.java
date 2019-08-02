package com.qixiafei.book.headfirst.gof.c6;

/**
 * <P>Description: 五命令. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 17:41</P>
 * <P>UPDATE AT: 2019/3/11 17:41</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("啥都不做");
    }
}
