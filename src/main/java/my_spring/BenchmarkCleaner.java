//package my_spring;
//
///**
// * @author Evgeny Borisov

// this is just an example of design pattern PROXY
// */
//public class BenchmarkCleaner implements Cleaner {
//
//    @InjectByType
//    private CleanerImpl cleaner;
//
//    @Override
//    public void clean() {
//        long start = System.nanoTime();
//        cleaner.clean();
//        long end = System.nanoTime();
//        System.out.println(end-start);
//    }
//}
