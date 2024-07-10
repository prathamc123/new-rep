package recursion___type__2__printing;

public class Letter___Keypad___Comination {
	static int n = 0 ;

	public static void main(String[] args) {
		String str ="67586" ;
		lettercom(str,"") ;
		System.out.println(n);

	}
	public static void lettercom(String str ,String path) {
		if(str.isEmpty()) {
			n++ ;
			System.out.println(path); 
			return ;
		}
		char ch = str.charAt(0) ;
		String remain = str.substring(1) ;
		String options = call(ch) ;
		for(int i = 0 ;i <options.length() ;i++) {
				
			lettercom(remain,path+options.charAt(i)) ;
		}
	
	}
	public static String call(char ch) {
		if(ch=='2') {
			return "abc"  ;
		}else if(ch=='3') {
			return "def" ;
		}else if(ch=='4') {
			return "ghi" ;
		}else if(ch=='5') {
			return "jkl" ;
		}else if(ch=='6') {
			return "mno" ;
		}else if(ch=='7') {
			return "pqrs" ;
		}else if(ch=='8') {
			return "tuv" ;
		}else {
			return "wxyz" ;
		}
	}

}
