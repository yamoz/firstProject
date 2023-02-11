package polymorphism;

public class Poly_main {
	// 使用時機:
	// refer to https://medium.com/%E7%A8%8B%E5%BC%8F%E6%84%9B%E5%A5%BD%E8%80%85/%E4%BB%80%E9%BA%BC%E6%98%AFoo-%E7%89%A9%E4%BB%B6%E5%B0%8E%E5%90%91%E8%88%87%E5%A4%9A%E5%9E%8B-30690aa3934c
	public static void main(String[] args) {
		// all animals can only eat, because parents only has eat() method
		Animal DonDonDonki = new Penguin();
		Animal Pikachu = new Mouse();
		DonDonDonki.eat();
		Pikachu.eat();
		System.out.println("===============================================================");
		// 若原本是用某種動物new，可以強制轉型變回正常的動物、使用該種動物的功能。
		Penguin DonDonDonki_penguin = (Penguin)DonDonDonki;
		Mouse Pikachu_mouse = (Mouse) Pikachu;
		DonDonDonki_penguin.sleep();
		Pikachu_mouse.sleep();
	}

}
