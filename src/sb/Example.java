package sb;

public class Example {

	public static void main(String[] args) {
		String str= "hi how are you geeks";
		System.out.println("Input: " +str);
		System.out.println("Output: " +reverseString(str));
	}

	private static String reverseString(String str) {
		String []strArr = str.split(" ");
		StringBuilder ans = new StringBuilder();
		ans.append(strArr[0]+ " ");
		for(int i=1; i<strArr.length-1; i++) {
			StringBuilder sb = new StringBuilder(strArr[i]);
			ans.append(sb.reverse()+" ");
		}
		ans.append(strArr[strArr.length-1]);
		return ans.toString();
	}
}
