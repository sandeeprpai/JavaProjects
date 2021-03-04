public class ReverseAlternate {

	private static String reverseHelp(String s) {
    if(s == null || s.length() == 0) return "";
    
    int i = 0, j = s.length() - 1;
    char[] ch = s.toCharArray();
    while(i < j) {
      char c = ch[i];
      ch[i] = ch[j];
      ch[j] = c;
      i++;
      j--;
    }
    return String.valueOf(ch);
  }
  
	public static String reverse(String str){//i love to code
    System.out.print("ReverseAlternate: ");
		if(str == null || str.length() == 0) return "";
	    
	    String[] s1 = str.split(" ");
	    
	    StringBuilder ss = new StringBuilder();
	    for(int i = s1.length - 1; i >= 0; i--) {
	      ss.append(s1[i]).append(" ");
	    }
	    
	    //reverse the complete string
	    String str1 = ss.toString();
	    String[] splitStr = str1.split(" ");// [code, to, love, i] 
    
	    StringBuilder sb = new StringBuilder();
    
    for(int i = 0; i < splitStr.length; i++) {
        if(i % 2 == 0) {
          sb.append(splitStr[i]).append(" ");
        } else {
          sb.append(reverseHelp(splitStr[i])).append(" ");
        }
    }
    
    return sb.toString().substring(0, sb.toString().length());
	}

}
