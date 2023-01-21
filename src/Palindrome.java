public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int c = 0;
		int d = x;
		while (d > 0) {
			c = c * 10 + d % 10;
			d = d / 10;
		}

		if (x == c) {
			return true;
		}
		return false;
	}

}
