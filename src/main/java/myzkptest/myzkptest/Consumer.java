package myzkptest.myzkptest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "consumer.xml" });
        context.start();
        for (int i = 0; i < 20000; i++) {
            long start = System.currentTimeMillis();
            DemoService demoService = (DemoService) context.getBean("demoService"); //
            System.out.println(demoService.sayHello("world"));
            long end = System.currentTimeMillis();
            System.out.println(end - start);
            System.in.read();
        }
        // long end = System.currentTimeMillis();
        // System.out.println("TPS: " + 20000 / ((end - start) / 1000.0));
        // System.out.println(end-start);
    }
}