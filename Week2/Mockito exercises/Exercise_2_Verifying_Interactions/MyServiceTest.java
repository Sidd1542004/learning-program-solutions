import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class MyServiceTest{
    @Test
    public void testFetchDataWithMockImplementation(){
        ExternalApi mockApi=new MockExternalApi(); 
        MyService service=new MyService(mockApi);
        assertEquals("Mocked Data",service.fetchData());
    }
    @Test
    public void testFetchDataWithMockito(){
        ExternalApi mockApi=mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Stubbed from Mockito");
        
        MyService service=new MyService(mockApi);
        assertEquals("Stubbed from Mockito",service.fetchData());

        verify(mockApi).getData();
    }
}
