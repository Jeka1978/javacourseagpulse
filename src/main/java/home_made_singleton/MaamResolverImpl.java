package home_made_singleton;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class MaamResolverImpl implements MaamResolver {
    private double maam;

    public MaamResolverImpl() {
        maam = getMaamFromServer();
    }

    @SneakyThrows
    private double getMaamFromServer() {
        Thread.sleep(4000);
        return 0.18;
    }

    @Override
    public double getMaam() {
        return maam;
    }
}
