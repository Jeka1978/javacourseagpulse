package my_spring;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobotImpl.class);
        iRobot.cleanRoom();
        System.out.println(iRobot.getClass());

//        AgPulseService service = ObjectFactory.getInstance().createObject(AgPulseService.class);
//        service.work();
    }
}
