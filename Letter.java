package tasks;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Letter {
	public static String[] collect(String s, int n) {
		List<String> list = new ArrayList<String>();
		for (int i = n; i <= s.length(); i+=n) {
			list.add(s.substring(i-n, i));
		}
		Collections.sort(list);
		return list.toArray(new String[list.size()]);
	}
}