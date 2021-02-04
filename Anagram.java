package tasks;

import java.util.*;
public class Anagram {
	public static String hiddenAnagram(String txt, String ph) {
	  String t = "", p = "";
	  for (int i = 0; i < txt.length(); i++) 
		  if (Character.isLetter(txt.charAt(i))) 
				t += Character.toLowerCase(txt.charAt(i));
	  for (int i = 0; i < ph.length(); i++)
		  if (Character.isLetter(ph.charAt(i))) 
				p += Character.toLowerCase(ph.charAt(i));
	  int len = p.length();
	  for (int i = 0; i <= t.length()-len; i++) 
		  if (isMatch(t.substring(i,i+len),p)) return t.substring(i,i+len);
	  return "noutfond";
	}
	public static boolean isMatch(String s, String t) {
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(t1);
		for (int i = 0; i < s1.length; i++) if (s1[i] != t1[i]) return false;
		return true;
	}
}