package my_spring;

/**
 * @author Evgeny Borisov
 */


public class AgPulseServiceImpl implements AgPulseService {


    @Override
    public void work() {
        System.out.println("working....");
        this.drinkBeer();
    }

    @Override
    @Benchmark
    public void drinkBeer() {
        System.out.println("Drinking beer");
    }
}
