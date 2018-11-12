package javaone;

public class Dog
{
	private String name;
	private String color;

	// 显示名字毛色的方法
	public void xianshi()
	{ // this表示当前对象，谁调用this就代表谁，this不能使用在静态方法
		System.out.println(this.name + "，颜色：" + this.color);
	}

	public static void main(String[] args)
	{
		// this不能用在静态方法中!!!

		Dog d1 = new Dog();
		d1.name = "Last丶炫";
		d1.color = "杂色";
		d1.xianshi();

		Dog d2 = new Dog();
		d2.name = "川川子";
		d2.color = "黑白";
		d2.xianshi();
	}

}
