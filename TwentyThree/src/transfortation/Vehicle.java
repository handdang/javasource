package transfortation;

public interface Vehicle {
	//상수[static final]
	
	
	//추상메소드[abstract]생략가능
	public abstract void run();
	default void electCharge() {
		System.out.println("충전중입니다.");
	}
}
