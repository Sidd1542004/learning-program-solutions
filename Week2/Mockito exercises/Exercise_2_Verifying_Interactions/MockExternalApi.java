
public class MockExternalApi implements ExternalApi {
    boolean getDataCalled = false;

    @Override
    public void getData() {
        getDataCalled = true;
        System.out.println("getData() was called");
    }

    public boolean wasGetDataCalled() {
        return getDataCalled;
    }
}