package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String profession;

	public Human03() {
		this.name = "刹那";
		this.age = 20;
		this.profession = "ソレスタルビーングのガンダムマイスター";
	}

	public String getProfile() {
		return "年齢は" + this.age + ",職業は" + this.profession;
	}

	public void greet(String friend) {
		if (friend == null) {
			System.out.println("対象目標をロストしました。");
			return;
		}
		System.out.println(friend + "を、駆逐する！");
	}

}
