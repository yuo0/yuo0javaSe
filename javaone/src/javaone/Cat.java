package javaone;

public class Cat
{

	public static void eat()
	{
		System.out.println("èè��ˮˮ");
	}

	// ���ɺ��� �޲���
	public Cat(String color)
	{
		System.out.println(color);
	}

	// ���ɺ��� �в���
	public Cat()
	{
		String color = "���ë";
		System.out.println(color);

	}

	public static void main(String[] args)
	{ // �в���
		Cat c1 = new Cat("���è");
		c1.eat();
		// �޲���
		Cat c2 = new Cat();
		c2.eat();

	}

}
