package chapter3_1;

public class Computer {

	// 데이터 멤버가 public이면 직접 엑세스 가능 -> 엑세스 메서드가 굳이 필요하지 않다.
	public String manufacturer;
	public String processor;
	public int ramSize;
	public int diskSize;
	public double processorSpeed;
	
	// 생성자가 없을 경우 자동으로 no-parameter 생성자가 만들어진다.
	// -> 생성자가 하나라도 있으면 자동으로 만들어지지 않는다.
	public Computer(String man, String proc, int ram, int disk, double procSpeed) {
		
		manufacturer = man;
		processor = proc;
		ramSize = ram;
		diskSize = disk;
		processorSpeed = procSpeed;
	}
	
	public double computePower() { // 컴퓨터의 계산능력.
		return ramSize * processorSpeed;
	}
	
	public double getRamSize() { // 있어도 그만,
		return ramSize;
	}
	public double getProcessorSpeed() { // 없어도 그만인
		return processorSpeed;
	}
	public int getDiskSize() { // 엑세스 메서드들.
		return diskSize;
	}
	
	// 객체의 값들을 하나의 문자열로 표현해서 리턴해준다.
	public String toString() { //
		String result = "Manufacturer: " + manufacturer +
						"\nCPU: " + processor +
						"\nRAM: " + ramSize + "megabytes" +
						"\nDisk: " + diskSize + "gigabytes" +
						"\nProcessor speed: " + processorSpeed + "gigahertz";
		return result;
	}
	
}
