public class Palindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}

	public static boolean isPalindrome(int x) {
		String num = Integer.toString(x);
		String revnum = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			revnum = revnum + num.charAt(i);
		}
		if (num.equalsIgnoreCase(revnum)) {
			return true;
		} else {
			return false;
		}

	}

}
