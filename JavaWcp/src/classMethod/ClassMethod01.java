package classMethod;

import classMethod.human.Human01;

public class ClassMethod01 {
    public static void main(String[] args) {
        Human01 setuna = new Human01();
        System.out.println("名前は" + setuna.name + "で、年齢は" + setuna.age + "です。");

        Human01 ribonnzu = new Human01("リボンズ", 25);
        System.out.println("名前は" + ribonnzu.name + "で、年齢は" + ribonnzu.age + "です。");
    }
}
