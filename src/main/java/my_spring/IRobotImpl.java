package my_spring;

/**
 * @author Evgeny Borisov
 */

@Benchmark
public final class IRobotImpl implements IRobot  {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;


    @Override
    public void cleanRoom() {
        speaker.speak("I started");
        cleaner.clean();
        speaker.speak("I finished");
    }
}
