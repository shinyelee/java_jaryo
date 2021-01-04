package T01;

import T02.*;

class TV {
	
	public static void main(String[] args) {
	
//		Computer com = new Computer();
//		System.out.println("컴퓨터의 가격 : " + com.price);
		// 같은 패키지 내라서 접근 가능.
		
		Product p = new Product();
		System.out.println("제품 전원 상태 : " + p.power);
		// 다른 패키지지만 public이므로 접근 가능.
	}

}
