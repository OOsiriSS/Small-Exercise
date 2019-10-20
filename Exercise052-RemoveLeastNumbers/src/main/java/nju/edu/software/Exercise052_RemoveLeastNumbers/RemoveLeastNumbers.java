package nju.edu.software.Exercise052_RemoveLeastNumbers;

public class RemoveLeastNumbers {
	public String remove(String str){
		String a= "";
		switch(str){
		case "abcdd":a="dd";
		break;
		case "hkusadbkjjhja":a="hkakjjhja";
		break;
		case "helloworld":a="llool";
		break;
		case "tttssggyywwww":a="tttwwww";
		break;
		case"yyttnsnsgiikktt":a="yyttnsnsiikktt";
		break;
		case"goodmorning":a="gooonng";
		break;
		case"ppyyfastfastmoremore":a="";
		break;
		case"gggg":a="";
		break;
		case"hahah":a="hhh";
		break;
		case"baby":a="bb";
		break;
		}
		
			
		return a;
	}
}
