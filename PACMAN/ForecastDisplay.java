package PACMAN;

/**
 * Created by UI on 23.10.2017.
 */
public class ForecastDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Forecast conditions: " + temperature + "F degress and" + humidity + "% humidity");
    }
}
