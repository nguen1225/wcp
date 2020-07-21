package classMethod;

import classMethod.human.Human03;

public class ClassMethod03 {
	public static void main(String[] args) {
		Human03 setuna = new Human03();

		System.out.println("私の名前は、" + setuna.name + "です。");
		String profile = setuna.getProfile();
		System.out.println(profile + "です。");

		setuna.greet("ロックオン");
		setuna.greet(null);
	}

}
