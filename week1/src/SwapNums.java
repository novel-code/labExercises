
public class SwapNums {
	public static void main(String[] args) {
		int first = 10, second = 40;
		System.out.println("--Before swap--");
		System.out.println("Frist number = " + first);
		System.out.println("Second number = " + second);
		System.out.println("--After swap--");
		first = first + second;
		second = first - second;
		first = first - second;
		System.out.println("Frist number = " + first);
		System.out.println("Second number = " + second);
	}
}
