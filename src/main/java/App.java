
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld hello1 = context.getBean("helloWorld", HelloWorld.class);
        HelloWorld hello2 = context.getBean("helloWorld", HelloWorld.class);

        Cat cat1 = context.getBean("cat", Cat.class);
        Cat cat2 = context.getBean("cat", Cat.class);

        System.out.println("Сравнение HelloWorld: " + (hello1 == hello2));
        System.out.println("Сравнение Cat: " + (cat1 == cat2));

        context.close();
    }
}