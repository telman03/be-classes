package app.annot;


import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import java.util.Set;

public class UsingAnnotations {
    public static void main(String[] args) {
        Reflections r = new Reflections(new ConfigurationBuilder()
                .setScanners(new SubTypesScanner(false), new ResourcesScanner())
                .addUrls(ClasspathHelper.forJavaClassPath())
                .filterInputsBy(
                        new FilterBuilder().includePackage("app")
                )
        );
        Set<Class<?>> classes = r.getSubTypesOf(Object.class);
        classes.forEach(System.out::println);
    }

}
