public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		int size=strs.length;
		String result="";
		int i,j;
		String[] s=new String[strs[0].length()];
		for(i=0;i<strs[0].length();i++){
			s[i]=strs[0].substring(i,i+1);
		}
		
		for(i=1;i<size;i++){
			if(strs[i].length()<s.length){
				for(j=0;j<strs[i].length();j++){
					if(strs[i].substring(j,j+1).equals(s[j])){
						
					}else{
						s[j]="";
					}
				}
				for(j=strs[i].length();j<s.length;j++){
					s[j]="";
				}
			}else{
				for(j=0;j<s.length;j++){
					if(strs[i].substring(j,j+1).equals(s[j])){
						
					}else{
						s[j]="";
					}
				}
			}
		}
		for(i=0;i<s.length;i++){
			result=result+s[i];
		}
		return result;
	}

}