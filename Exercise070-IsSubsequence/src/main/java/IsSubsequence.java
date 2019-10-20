public class IsSubsequence {

	 public static boolean isSubsequence(String s, String t) {
		 String strs[]=s.split("");
	     String ts[]=t.split("");
	     for(int i=0;i<ts.length;i++){
	    	boolean sign=true;
	    	 for(int j=0;j<strs.length;j++){
	    		if(ts[i].equals(strs[j])){
	    			sign=false;
	    		}
	    		
	    	}
	    	 if(sign){
	    		 t=t.replaceAll(ts[i], "");
	    	 }
	     }
	     System.out.println(t+"\n"+s);
	     if(s.equals(t)){
	    	 return true;
	     }
		 return false;
	 }
}