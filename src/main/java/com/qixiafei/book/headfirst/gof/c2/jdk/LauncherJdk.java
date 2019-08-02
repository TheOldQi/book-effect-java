package com.qixiafei.book.headfirst.gof.c2.jdk;

import com.qixiafei.book.headfirst.gof.c2.CurrentConditionsDisplay;
import com.qixiafei.book.headfirst.gof.c2.DisplayElement;
import com.qixiafei.book.headfirst.gof.c2.WeatherData;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/6 15:08</P>
 * <P>UPDATE AT: 2019/3/6 15:08</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class LauncherJdk {

    public static void main(String[] args) {
        final WeatherDataJdk subject = new WeatherDataJdk();
        final DisplayElement ob1 = new CurrentConditionsDisplayJdk(subject);
        ob1.display();
        subject.setMeasurements(0.2f, 0.3f, 0.4f);
        subject.setMeasurements(0.5f, 0.6f, 0.7f);
        subject.setMeasurements(0.8f, 0.9f, 1.0f);


    }
}
