
public class Chapter07 {
	public static void main(String[] args) {
		int lunchMoney = 1000;
		if (lunchMoney >= 800) {
			System.out.println("味噌ラーメンが食べれます。");
		} else if (lunchMoney > 600) {
			System.out.println("ラーメンが食べれます。");
		} else {
			System.out.println("お金がないので帰りましょう。");
		}
	}

}
