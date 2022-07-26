package kr.co.ezenac.di04;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

class Engine {}
class Door {}
class Car {
	String color;
	int oil;
	Engine engine;
	Door[] doors;
	
	public Car() {}

	public Car(String color, int oil, Engine engine, Door[] doors) {
		super();
		this.color = color;
		this.oil = oil;
		this.engine = engine;
		this.doors = doors;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setDoors(Door[] doors) {
		this.doors = doors;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car {" +
				"color=" +color+
				", oil=" +oil+
				", engine=" +engine+
				", door=" + Arrays.toString(doors)+
				"}";
	}
}


public class SpringDiTest {

	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("config.xml");
		
		Car car = (Car) ac.getBean("car");
		
		System.out.println("car= " + car);
		

	}

}
















