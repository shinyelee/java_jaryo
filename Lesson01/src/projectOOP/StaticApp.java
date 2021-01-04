package projectOOP;

class Foo {
	
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar);	 // ���� ����
//		System.out.println(instanceVar); // ���� �Ұ�
	}
	
	public void instanceMethod() {
		System.out.println(classVar);	 // ���� ����
		System.out.println(instanceVar); // ���� ����
	}
}

public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);	 // ���� ����
//		System.out.println(Foo.instanceVar); // ���� �Ұ�
		Foo.classMethod();	  // ���� ����
//		Foo.instanceMethod(); // ���� �Ұ�
		
		Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classVar);	// I class var
        System.out.println(f1.instanceVar); // I instance var

        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar); // changed by f1
        System.out.println(f2.classVar);  // changed by f1

        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar); // changed by f1
        System.out.println(f2.instanceVar); // I instance var
    }

}
