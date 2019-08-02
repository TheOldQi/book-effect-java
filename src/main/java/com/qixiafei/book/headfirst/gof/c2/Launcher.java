package com.qixiafei.book.headfirst.gof.c2;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/6 14:45</P>
 * <P>UPDATE AT: 2019/3/6 14:45</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Launcher {

    public static void main(String[] args) {
        final WeatherData subject = new WeatherData();
        final DisplayElement ob1 = new CurrentConditionsDisplay(subject);
        ob1.display();
        subject.serMeasurements(0.2f, 0.3f, 0.4f);
        subject.serMeasurements(0.5f, 0.6f, 0.7f);
        subject.serMeasurements(0.8f, 0.9f, 1.0f);

    }
}
