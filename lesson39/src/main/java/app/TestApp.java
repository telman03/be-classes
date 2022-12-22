package app;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class TestApp {
    public static void main0(String[] args) {
        Point2D point2D = new Point2D(10, 53);
        Class<? extends Point2D> klass = point2D.getClass();
        String name = klass.getCanonicalName();
        System.out.println(name);
        point2D.printMe();
    }

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        String classname = "app.Point2D";
        Class<?> aClass = Class.forName(classname);
        Constructor<?>[] constructors = aClass.getConstructors();

        Constructor<?>[] cc;
        cc = aClass.getConstructors(Integer.class, Integer.class);


        for(Constructor c : constructors){
            System.out.println(c);
        }
        Constructor<?> theShortestConstructor = Arrays
                .stream(constructors)
                .sorted(Comparator.comparingInt((Constructor<?> o) -> o.getParameterCount()).reversed())
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("no constructor found"));
        System.out.println(theShortestConstructor);
        Constructor<?> theLongestConstructor = Arrays
                .stream(constructors)
                .sorted(Comparator.comparingInt((Constructor<?> o) -> o.getParameterCount()).reversed())
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("no constructor found"));
        System.out.println(theLongestConstructor);

        int parameterCount = theLongestConstructor.getParameterCount();
        Class<?>[] parameterTypes = theLongestConstructor.getParameterTypes();
        System.out.println(Arrays.toString(parameterTypes));
        Object instance = theLongestConstructor.newInstance(11, 22);

//        Point2D p = (Point2D) instance;
//        p.printMe();

        String methodToCall = "printMe";
        Method method = aClass.getMethod(methodToCall);

        method.invoke(instance);
    }
}
