package javaone;

public class Db
{

	String host;

	String username;

	String userpwd;

	String url;

	// 1.一个类中如果没有任何构造函数，Java编译器会隐式自动提供一个没有参数的构造函数给创建对象使用
	// 2.如果一个类中提供了构造函数，创建对象必须依赖这个构造函数

	// 构造函数作用:给类中的属性进行初始化赋值
	public Db(String host, String username, String userpwd, String url)
	{

		this.host = host;
		this.username = username;
		this.userpwd = userpwd;
		this.url = url;

		System.out.println("有参数的构造函数");
	}

	public Db()
	{

		System.out.println("没有参数的构造函数");
	}

	public static void main(String[] args)
	{
		// 如果一个类有多个构造函数，那么就个创建对象提供了多个访问机制
		// 多个构造函数形成了重载，同一个方法名，不同的实现结果
		Db d1 = new Db();

	}

}
