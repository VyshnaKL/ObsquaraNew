package com.main;

public class OverloadingExample {
	int x;
	int y;
	int add;

	OverloadingExample() {
		x = 10;
		y = 50;

	}

	OverloadingExample(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void add() {
		add = x + y;
		System.out.println("Sum (no args): " + add);
	}

	void add(int x, int y) {
		add = x + y;
		System.out.println("Sum (two args): " + add);
	}

	public static void main(String[] args) {
		OverloadingExample obj1 = new OverloadingExample();
		obj1.add();

		OverloadingExample obj2 = new OverloadingExample(30, 40);
		obj2.add();

		obj2.add(50, 60);
	}

}
