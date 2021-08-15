package annotation;

@Service(name = "SimpleService")
public class SimpleService {

    @Init
    public void initService() {
        System.out.println("SimpleService");
    }

    public void simpleService() {
        System.out.println("Another simple service method");
    }
}
