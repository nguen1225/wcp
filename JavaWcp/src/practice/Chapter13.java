package practice;

import extend.phone.MobilePhone;
import extend.phone.Phone;

public class Chapter13 {
	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone("000 - 1212 - 4343");
		mobilePhone.takePicture();
		Chapter13.staticCall(mobilePhone, "99 - 113 - 4649");
		mobilePhone.powerOFF();

		FlyingPhone flyingPhone = new FlyingPhone(5);
		flyingPhone.fly();
		Chapter13.staticCall(flyingPhone, "000 - 1111 - 2222");
		flyingPhone.powerOFF();
	}

	public static void staticCall(Phone phone, String number) {
		phone.call(number);
	}

}
