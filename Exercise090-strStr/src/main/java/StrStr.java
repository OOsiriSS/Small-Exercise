public class StrStr {



	public static int strStr(String haystack, String needle) {

        int length=needle.length();

        int length2=haystack.length();

        if(length2<length){

        	return -1;

        }

        if(length2==0){

        	if(length==0){

        		return 0;

        	}

        	else{

        		return -1;

        	}

        }

        System.out.println(length);

        for(int i=0;i<haystack.length();i++){

        	String temp=haystack.substring(i, i+length);

        	if(temp.equals(needle)){

        		return i;

        	}

        			

        }

		return -1;

    } 

}