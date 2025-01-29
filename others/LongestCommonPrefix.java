package others;

class Solution1 {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0 || strs[0].length() == 0)
			return "";
		int prefix[] = new int[256];
		String s = "";
		if (strs.length > 1) {
			int length = strs.length;
			for (int i = 1; i < length; i++) {
				String d = strs[i - 1];
				if (strs[i] == null || strs[i].length() == 0)
					return "";

				for (int j = 0; j < ((strs[i].length() < d.length()) ? strs[i].length() : d.length()); j++) {
					char c = strs[i].charAt(j);
					if (strs[i - 1].charAt(j) == c) {
						prefix[c]++;
						if (prefix[c] == length - 1) {
							s += strs[i].charAt(j);
							prefix[c] = 0;
						}
					} else {
						break;
					}
				}
			}
		} else {
			for (int i = 0; i < strs[0].length(); i++) {
				s += strs[0].charAt(i);
			}
		}
		return s;
	}

	public String longestCommonPrefix1(String[] strs) {
		if (strs == null || strs.length == 0 || strs[0].length() == 0)
			return "";
		String s = "";
		if (strs.length > 1) {
			String d = strs[0];
			for (int i = 1; i < strs.length; i++) {
				s = "";

				if (strs[i] == null || strs[i].length() == 0)
					return "";
				int minLength = Math.min(strs[i].length(), d.length());
				for (int j = 0; j <  minLength; j++) {
					if (d.charAt(j) == strs[i].charAt(j)) {
						s += d.charAt(j);
					} else {
						break;
					}
				}
				d = s;
			}
			return s;
		} else {

			return strs[0];
		}
	}
}

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strings = { "abcc", "abcc", "ab" };
		Solution1 solution = new Solution1();
		String string = solution.longestCommonPrefix1(strings);
		System.out.println(" :- " + string);

	}
}
