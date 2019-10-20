
public class PhoneKeyPad{

	public static String convert(String s){
		if(s==null||s==""){
			return "";
		}
		else{
		int changdu=s.length();
		String result="";
		for(int t=0;t<changdu;t++){
			char wow=s.charAt(t);
			if(wow=='a'||wow=='b'||wow=='c'||wow=='A'||wow=='B'||wow=='C'){
				result=result+"2,";
			}
			if(wow=='d'||wow=='e'||wow=='f'||wow=='D'||wow=='E'||wow=='F'){
				result=result+"3,";
			}
			if(wow=='g'||wow=='h'||wow=='i'||wow=='G'||wow=='H'||wow=='I'){
				result=result+"4,";
			}
			if(wow=='j'||wow=='k'||wow=='l'||wow=='J'||wow=='K'||wow=='L'){
				result=result+"5,";
			}
			if(wow=='m'||wow=='n'||wow=='o'||wow=='M'||wow=='N'||wow=='O'){
				result=result+"6,";
			}
			if(wow=='p'||wow=='q'||wow=='r'||wow=='P'||wow=='Q'||wow=='R'||wow=='s'||wow=='S'){
				result=result+"7,";
			}
			if(wow=='t'||wow=='u'||wow=='v'||wow=='T'||wow=='U'||wow=='V'){
				result=result+"8,";
			}
			if(wow=='w'||wow=='x'||wow=='y'||wow=='W'||wow=='X'||wow=='Y'||wow=='z'||wow=='Z'){
				result=result+"9,";
			}
			
		}
	String result1=result.substring(0,2*changdu-1);
		return result1;
	}
}
}