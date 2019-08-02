package com.qixiafei.book.headfirst.gof.c2;

import java.util.ArrayList;
import java.util.List;

/**
 * <P>Description: 气象数据 - 主题. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/6 14:29</P>
 * <P>UPDATE AT: 2019/3/6 14:29</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class WeatherData implements Subject {

    private List<Observer> observerList;

    /**
     * 温度.
     */
    private float temperature;

    /**
     * 湿度.
     */
    private float humidity;

    /**
     * 气压
     */
    private float pressure;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(temperature, humidity, pressure);
        }
    }

    /**
     * 当测量值改变时该方法将被调用.
     */
    public void measurementsChange() {
        notifyObservers();
    }

    /**
     * 设置新的测量值.
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void serMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChange();

    }
}
