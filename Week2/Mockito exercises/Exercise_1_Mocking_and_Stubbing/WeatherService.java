public class WeatherService{
    private WeatherApi api;
    public WeatherService(WeatherApi api){
        this.api=api;
    }
    public String fetchForecast(){
        return api.getForecast();
    }
}

