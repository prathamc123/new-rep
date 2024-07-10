package recursion___type__2__printing;

import java.util.ArrayList;
import java.util.List;

public class Palindriome___Partitioning {

	public static void main(String[] args) {
		List<String> al =new ArrayList<String>() ;
		partition("nittin", "",al);
		System.out.println(al);
	}

	public static void partition(String str, String path,List<String> al) {
		if (str.isEmpty()) {
			al.add(path) ;
			return;
		}
		for (int i = 1; i <= str.length(); i++) {
			String part = str.substring(0, i);
			String remain = str.substring(i);
			if(palin(part)) {
			partition(remain, path + "***" + part,al);
			}

		}

	}
	public static boolean palin(String str) {
		int i = 0 ;
		int j = str.length()-1 ;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false ;
			}
			i++ ;
			j-- ;
		}
		return true ;
	}

}
