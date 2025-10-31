public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int) (Math.random() * lim);
		int b = (int) (Math.random() * lim);
		int c = (int) (Math.random() * lim);
		System.out.println(a + " " + b + " " + c);

		int min = Math.min(a,b);
		int smallestOfAll = Math.min(min, c);

		int max = Math.max(a,b);
		int biggestOfAll = Math.max(max, c);

		int middle = (a + b + c) - (smallestOfAll+ biggestOfAll);

		System.out.println(smallestOfAll + " " + middle + " " + biggestOfAll);
	}
} 