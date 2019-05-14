package java19;

public class SuperMan extends Man{
	int power;
	int speed;
	
	public SuperMan(double eye, int weight, int power, int speed) {
		super(eye, weight);
		this.power = power;
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "SuperMan [power=" + power + ", speed=" + speed + ", eye=" + eye + ", weight=" + weight + "]";
	}
	
	
}
