package com.qixiafei.book.headfirst.gof.c3.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 10:57</P>
 * <P>UPDATE AT: 2019/3/11 10:57</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class InputTest {

    public static void main(String[] args) throws IOException {
        InputStream is = new LowercaseInputStream(new BufferedInputStream(new FileInputStream("C:\\code\\self\\book-headfirst-gof\\target\\classes\\test.txt")));
        int c;
        while ((c = is.read()) > 0) {
            System.out.print((char) c);
        }
    }
}
