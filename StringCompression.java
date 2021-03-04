public class StringCompression {

	public String stringCompression(String str) {
    System.out.print("StringCompression: ");
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count++;
			//if (i+1 >= str.length() || str.charAt(i + 1) != str.charAt(i)) {
			if (i+1 < str.length() && str.charAt(i + 1) != str.charAt(i)) {
				sb.append(str.charAt(i)).append(count);
//				if(count > 1)
//					sb.append(str.charAt(i)).append(count);
//				else
//					sb.append(str.charAt(i));
				count = 0;
			}
		}

		return sb.toString();
	}

}
