package transfortation;

public interface Vehicle {
	//���[static final]
	
	
	//�߻�޼ҵ�[abstract]��������
	public abstract void run();
	default void electCharge() {
		System.out.println("�������Դϴ�.");
	}
}
