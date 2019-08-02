package com.qixiafei.book.headfirst.gof.c2.jdk;

import com.qixiafei.book.headfirst.gof.c2.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * <P>Description: 当前天气情况布告板. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/6 14:38</P>
 * <P>UPDATE AT: 2019/3/6 14:38</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class CurrentConditionsDisplayJdk implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionsDisplayJdk(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataJdk) {
            this.temperature = ((WeatherDataJdk) weatherData).getTemperature();
            this.humidity = ((WeatherDataJdk) weatherData).getHumidity();
            display();
        }
    }
}
