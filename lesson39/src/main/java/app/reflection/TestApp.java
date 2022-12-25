package app.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class TestApp {
    public static void main0(String[] args) {
        Point2D point2D = new Point2D(10, 53);
        Class<? extends Point2D> klass = point2D.getClass();
        String name = klass.getCanonicalName();
        System.out.println(name);
        point2D.printMe();
    }

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        String classname = "app.reflection.Point2D";
        Class<?> aClass = Class.forName(classname);
        Constructor<?>[] constructors = aClass.getConstructors();

        Constructor<?>[] cc = aClass.getConstructors();


        for(Constructor c : constructors){
            System.out.println(c);
        }
        Constructor<?> theShortestConstructor = Arrays
                .stream(constructors)
                .sorted(Comparator.comparingInt(Constructor::getParameterCount))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("no constructor found"));
        System.out.println(theShortestConstructor);
        List<Constructor<?>> toSort = new ArrayList<>();
        for (Constructor<?> constructor : constructors) {
            toSort.add(constructor);
        }
        toSort.sort(Comparator.comparingInt((Constructor<?> o) -> o.getParameterCount()));
        Optional<Constructor<?>> found = Optional.empty();
        for (Constructor<?> constructor : toSort) {
            found = Optional.of(constructor);
            break;
        }
        Constructor<?> theLongestConstructor = found
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