import java.util.HashSet;

public class LottoNum {

	public HashSet<Integer> getLottoNum() {
		HashSet<Integer> set = new HashSet<Integer>();

		while (set.size() < 6) {
			set.add((int) (Math.random() * 45) + 1);
		}

		System.out.println(set);
		return set;

	}
}
