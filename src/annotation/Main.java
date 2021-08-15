package annotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);

    }

    static void inspectService(Class<?> service) {
        if (service.isAnnotationPresent(Service.class)) {
            Service ann = service.getAnnotation(Service.class);
            System.out.println(ann.annotationType().getName());

        } else {
            System.out.println("Service not found in class " + service.getName());
        }
    }

}
