//exception
public class MyNumber {
	int first number;
	int second number;
	int i;
	double result;

	public MyNumber(int a, int b) {
		super();
		this.first number = a;
		this.second number = b;
	}

	public void check(int i) {
		
		int ch = i;
		switch (ch) {
		case 1: {
			try {
				result = a + b;
				System.out.println("Addition =" + result);
			} catch (Exception e) {
				throw new IllegalArgumentException();
			}
			break;
		}

		case 2: {
			try {
				result = a - b;
				System.out.println("Subtraction =" + result);
			} catch (Exception e) {
				throw new IllegalArgumentException();
			}
			break;
		}

		case 3: {
			try {
				result = a * b;
				System.out.println("Multiplication =" + result);
			} catch (Exception e) {
				throw new IllegalArgumentException();
			}
			break;
		}

		case 4: {
			try {
				result = a / b;
				System.out.println("Division =" + result);
			} catch (Exception e) {
				throw new IllegalArgumentException("Enter appropriate number");
			}
			break;
		}

		}
	}
}
