package transfortation;

public class Vehicle_Example {

	public static void main(String[] args) {
		//Vehicle vehicle2 = new Vehicle
		Vehicle vehicle = new Bus(); //자동형변환
		
		vehicle.run(); //Vehicle인터페이스에서 선언되고 Bus에서 구현된것
		//vehicle.checkFare();
		
		vehicle = new Taxi();
		vehicle.run();
		
		vehicle = new Airplane();
		vehicle.run();
		
		if(vehicle instanceof Bus) {
			System.out.println("변경가능합니다.");
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
		
		}
	}

}
