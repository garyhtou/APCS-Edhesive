import java.util.*;

import _Interfaces.*;

public class TEST_FILE implements IDebug, IArray{

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		IArray.add(list, "hey", "hi");
		
		IDebug.pl(list);
	}

}
