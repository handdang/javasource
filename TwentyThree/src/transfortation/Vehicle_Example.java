package transfortation;

public class Vehicle_Example {

	public static void main(String[] args) {
		//Vehicle vehicle2 = new Vehicle
		Vehicle vehicle = new Bus(); //�ڵ�����ȯ
		
		vehicle.run(); //Vehicle�������̽����� ����ǰ� Bus���� �����Ȱ�
		//vehicle.checkFare();
		
		vehicle = new Taxi();
		vehicle.run();
		
		vehicle = new Airplane();
		vehicle.run();
		
		if(vehicle instanceof Bus) {
			System.out.println("���氡���մϴ�.");
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
		
		}
	}

}
