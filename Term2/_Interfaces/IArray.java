package _Interfaces;

import java.util.*;

public interface IArray {
	public static void add(ArrayList arrayList, Object... object) {
		for(int i = 0; i < object.length; i++) {
			arrayList.add(object[i]);
		}
	}
}
