import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.Class.forName;

@SuppressWarnings("ALL")
public class MainClass {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class c = forName("ReflectionDemo");
        ReflectionDemo r = (ReflectionDemo) c.newInstance();

        Method m=c.getDeclaredMethod("demo",null);
        m.setAccessible(true);
        m.invoke(r,null);

    }
}
