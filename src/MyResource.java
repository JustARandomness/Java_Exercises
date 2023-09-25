public class MyResource implements AutoCloseable{
    private String resourceName;

    public MyResource(String name) {
        this.resourceName = name;
    }

    public void act() {
        System.out.println(this.resourceName + " is doing something");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed");
    }
}
