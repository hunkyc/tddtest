
public class HelloWorld {
    private String message;
    public HelloWorld(String name) {
        message = "Hello ".concat(name);
    }

    public String getMessage() {
        return message;
    }
}