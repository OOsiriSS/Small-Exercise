public class IsomorphicStrings {

	public static boolean isIsomorphic(String s, String t) {
		if(function(t).equals(function(s))){
			return true;
		}
		return false;
	}
	public static String function(String str){
		char cha='1';
		
		String result="1";
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)!=str.charAt(i-1)){
				cha++;
				result+=cha;
			}
			else{
				result+=cha;
			}
		}
		return result;
	}
}
