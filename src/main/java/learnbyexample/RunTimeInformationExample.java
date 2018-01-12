package learnbyexample;

import java.util.Arrays;

public class RunTimeInformationExample {

    private static Integer[] intArrays = {5, 15, 25};
    private static String[] stringArrays = {"google", "IBM", "facebook"};

    private static final long MEGABYTE = 1024L * 1024L;

    private static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    public static void main(String[] args) throws Exception {
        StringBuilder testString = new StringBuilder();
        final Runtime runtime = Runtime.getRuntime();
        System.out.println("Start Free Memory : " + bytesToMegabytes(runtime.freeMemory()));
        System.out.println("Started Thread activeCount : " + Thread.activeCount());

        Arrays.stream(intArrays).forEach(f -> {
                    new Thread(f.toString()) {
                        @Override
                        public void run() {
                            System.out.println("Thread name : " + getName());
                            System.out.println("Free Memory : " + runtime.freeMemory());
                            System.out.println("Thread activeCount : " + Thread.activeCount());
                            if ("25".equalsIgnoreCase(getName())) {
                                testString.append("found");
                            }
                        }
                    }.start();
                }
        );
        System.out.println("testString : " + testString.toString());
        Thread.sleep(1000);
        System.out.println("last Thread activeCount : " + Thread.activeCount());
        System.out.println("Memory used : " + bytesToMegabytes(runtime.totalMemory() - runtime.freeMemory()) + " MB");

    }
}
