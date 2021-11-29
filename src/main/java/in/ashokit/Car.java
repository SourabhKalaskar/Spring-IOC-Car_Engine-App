package in.ashokit;

public class Car {

	IEngine engine;

	public void setEngine(IEngine engine) {
		this.engine = engine;
	}

	public void drive() {
		int engStatus = engine.start();

		if (engStatus == 1) {
			System.out.println("Journey Started");
		}

		else {
			System.out.println("Engine Failed to Start");
		}
	}

}
