
public class MyServiceTest {
    public static void main(String[] args) {
        MockExternalApi mockApi = new MockExternalApi();

        MyService service = new MyService(mockApi);
        service.fetchData();

        if (mockApi.wasGetDataCalled()) {
            System.out.println("Test Passed: getData() was called.");
        } else {
            System.out.println("Test Failed: getData() was NOT called.");
        }
    }
}