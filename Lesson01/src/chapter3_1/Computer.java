package chapter3_1;

public class Computer {

	// ������ ����� private�̸� �ڳ� Ŭ�������� ��� �Ұ�.
	// protected�� �ڳ� Ŭ���������� ����� �� �ִ�.
	public String manufacturer;
	public String processor;
	public int ramSize;
	public int diskSize;
	public double processorSpeed;
	
	// �����ڰ� ���� ��� �ڵ����� no-parameter �����ڰ� ���������.
	// -> �����ڰ� �ϳ��� ������ �ڵ����� ��������� �ʴ´�.
	public Computer(String man, String proc, int ram, int disk, double procSpeed) {
		
		manufacturer = man;
		processor = proc;
		ramSize = ram;
		diskSize = disk;
		processorSpeed = procSpeed;
	}
	
	public double computePower() { // ��ǻ���� ���ɷ�.
		return ramSize * processorSpeed;
	}
	
	public double getRamSize() { // �־ �׸�,
		return ramSize;
	}
	public double getProcessorSpeed() { // ��� �׸���
		return processorSpeed;
	}
	public int getDiskSize() { // ������ �޼����.
		return diskSize;
	}
	
	// ��ü�� ������ �ϳ��� ���ڿ��� ǥ���ؼ� �������ش�.
	public String toString() { //
		String result = "Manufacturer: " + manufacturer +
						"\nCPU: " + processor +
						"\nRAM: " + ramSize + " MB" +
						"\nDisk: " + diskSize + " GB" +
						"\nProcessor speed: " + processorSpeed + " GHz";
		return result;
	}
	
}
