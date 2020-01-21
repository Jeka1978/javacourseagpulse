package home_made_singleton;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class MaamResolverSingleton {
    private static MaamResolverSingleton ourInstance = new MaamResolverSingleton();

    public static MaamResolverSingleton getInstance() {
        return ourInstance;
    }

    private MaamResolverSingleton() {
    }

    @SneakyThrows
    public double getMaam(){
        Thread.sleep(4000);
        return 0.19;

    }
}
