import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Method[] methods = String.class.getMethods();

        for (Method method : methods) {
            System.out.println(method.toString());
        }
    }
}
