package strategy;

public abstract class Duck {
	protected QuackBehavior quackBehavior;

	protected FlyBehavior flyBehavior;

	public abstract void display();

	public void swim() {
		System.out.println("swim");
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void performFly() {
		flyBehavior.fly();
	}
}
