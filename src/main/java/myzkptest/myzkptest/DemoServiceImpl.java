package myzkptest.myzkptest;

public class DemoServiceImpl implements DemoService {
	public String sayHello(String name) {
		System.out.println(name);
		return "Hello " + name;
	}
}