package javaone;

public class Cat
{

	public static void eat()
	{
		System.out.println("猫猫缩水水");
	}

	// 构成函数 无参数
	public Cat(String color)
	{
		System.out.println(color);
	}

	// 构成函数 有参数
	public Cat()
	{
		String color = "大黄毛";
		System.out.println(color);

	}

	public static void main(String[] args)
	{ // 有参数
		Cat c1 = new Cat("大黄猫");
		c1.eat();
		// 无参数
		Cat c2 = new Cat();
		c2.eat();

	}

}
