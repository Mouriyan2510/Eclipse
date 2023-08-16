package practicing;

public class FindMissingNum {
	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 6, 8, 10 };
		int c = a[0];
		int d = a[a.length - 1];
		for (int i = c; i <= d; i++) {
			if (!contains(a, i)) {
				System.out.println(i);
			}
		}

	}

	public static boolean contains(int a[], int num) {
		for (int j : a) {
			if (j == num) {
				return true;
			}
		}
		return false;
	}
}
