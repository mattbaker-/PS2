package MainPackage;

public class MyInteger {
	
	private int value;
	
	public static void main(String[] args) {
		
		MyInteger a = new MyInteger(4);
		MyInteger b = new MyInteger(5);
		MyInteger c = new MyInteger(6);
		
		System.out.println(a.value + " is even: " + a.isEven());
		System.out.println(b.value + " is even: " + b.isEven());
		System.out.println(c.value + " is even: " + c.isEven());
		
		System.out.println(a.value + " is odd: " + a.isOdd());
		System.out.println(b.value + " is odd: " + b.isOdd());
		System.out.println(c.value + " is odd: " + c.isOdd());
		
		char[] ch = {'1', '9', '0', '3'};
		System.out.println(c.parseInt(ch));
		
		String st = "1903";
		System.out.println(c.parseInt(st));
		
	}
	
	public MyInteger(int v) {
		this.value = v;
	}
	
	public int getVal() {
		return value;
	}
	
	public Boolean isEven() {
		if (value%2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Boolean isOdd() {
		if (value%2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Boolean isPrime() {
		if (value%2 == 2) {
			return false;
		}
		for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0) {
            	return false;
            }
		}
        return true;
	}
	
	public Boolean isEven(int v) {
		MyInteger i = new MyInteger(v);
		return i.isEven();
	}
	
	public Boolean isOdd(int v) {
		MyInteger i = new MyInteger(v);
		return i.isOdd();
	}
	
	public Boolean isPrime(int v) {
		MyInteger i = new MyInteger(v);
		return i.isPrime();
	}
	
	public Boolean isEven(MyInteger v) {
		return v.isEven();
	}
	
	public Boolean isOdd(MyInteger v) {
		return v.isOdd();
	}
	
	public Boolean isPrime(MyInteger v) {
		return v.isPrime();
	}
	
	public Boolean equals(int i) {
		if (i == value) {
			return true;
		}
		else return false;
	}
	
	public Boolean equals(MyInteger i) {
		if (i.value == value) {
			return true;
		}
		else return false;
	}
	
	public static int parseInt(char[] ch) {
		int number = Integer.parseInt(String.valueOf(ch));
		return number;
	}
	
	public static int parseInt(String st) {
		int number = Integer.parseInt(st);
		return number;
	}
}
