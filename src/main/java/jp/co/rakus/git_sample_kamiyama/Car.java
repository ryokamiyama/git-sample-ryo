package jp.co.rakus.git_sample_kamiyama;

public class Car {

	private int speed;
	private String energy;
	
	
	public String getEnergy() {
		return energy;
	}

	public void setEnergy(String energy) {
		this.energy = energy;
	}

	public void run() {
		this.speed += 5;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
