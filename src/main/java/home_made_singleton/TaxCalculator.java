package home_made_singleton;

/**
 * @author Evgeny Borisov
 */
public class TaxCalculator {

    private MaamResolver maamResolver;

    public TaxCalculator(MaamResolver maamResolver) {
        this.maamResolver = maamResolver;
    }

    public double withMaam(double price) {
        return price * maamResolver.getMaam()+price;
    }


}
