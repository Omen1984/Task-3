import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat catOne =
                (Cat) applicationContext.getBean("cat");
        Cat catTwo =
                (Cat) applicationContext.getBean("cat");

        boolean isOneHello = beanOne == beanTwo;
        boolean isOneCat = catOne == catTwo;

        System.out.println("Тест BeanScope singleton = " + isOneHello);
        System.out.println("Тест BeanScope prototype = " + isOneCat);


    }
}