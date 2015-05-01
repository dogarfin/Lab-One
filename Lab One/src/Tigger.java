class Tigger {
	int x;
	String y;
	Tigger(int x, String y) {
		this.x = x;
		this.y = y;
	}
	void bounceX() {
		int sum = 0;
		while (x != 0) {
			int d = x % 10;
			x = x / 10;
			sum += d * d;
		}
		this.x = sum;
	}
	void bounceY() {
		int sum = 0;
		for (int i = 0; i < y.length(); i++)
			sum += (y.charAt(i) - '0') * (y.charAt(i) - '0');
		this.y = sum + "";
	}
	void bounce() {
		this.bounceX();
		this.bounceY();
	}
	void report() { System.out.println( "Tigger at (" + x + ", " + y + ")" ); }
	public static void main(String[] args) {
		Tigger a = new Tigger(21, "29");
		a.report();
		for (int i = 0; i < 20; i++) {
			a.bounce();
			a.report();
		}
	}
}