package tasks;

import java.util.*;
public class Message {
  public static String nicoCipher(String msg, String key) {
		int len = msg.length();
	  int c = key.length();
	  int r = (len-len%c)/c;
	  if (len%c != 0) r++;
	  for (int i = len; i < r*c; i++) msg += " ";
	  char[][][] v = new char[r][c][2];
	  for (int i = 0; i < r; i++) {
	  	for (int j = 0; j < c; j++) {
				v[i][j][0] = msg.charAt(i*c+j);
				v[i][j][1] = key.charAt(j);
			}
	  	Arrays.sort(v[i], (a,b) ->(int) a[1] - (int) b[1]);										
	  }
	  String s = "";
	  for (int i = 0; i < r; i++) 
	  	for (int j = 0; j < c; j++) s += v[i][j][0];
	  return s;
  }
}