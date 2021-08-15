package annotation;

@Service(name = "LazyService")
public class LazyService {

    @Init
    public void lazyInit() throws Exception {
        System.out.println("LazyService");
    }
}
