public class TheLoneInteger {
	public int findIt(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			boolean isOnlyOne = true;
			for (int j = 0; j < a.length; j++) {
				if(i != j && a[i] == a[j]) isOnlyOne = false;
			}
			if(isOnlyOne)return a[i];
		}
		
		return 0;
	}
}