
public class ClassMethod01 {
	public static void main(String[] args) {
		Human00 amuro = new Human00();
		System.out.println("名前は" + amuro.name + "で、年齢は" + amuro.age + "です。");

		Human00 syaa = new Human00("シャア", 25);
		System.out.println("名前は" + syaa.name + "で、年齢は" + syaa.age + "です。");
	}

}
