import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class WeatherServiceTest{
    @Test
    public void testVerifyForecastCalled(){
        WeatherApi mockApi=mock(WeatherApi.class);
        WeatherService service=new WeatherService(mockApi);
        service.fetchForecast();
        verify(mockApi).getForecast();
    }
}
