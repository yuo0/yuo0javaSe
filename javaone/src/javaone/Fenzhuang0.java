package javaone;

public class Fenzhuang0
{
	//this不能使用在静态方法里
	public static void main(String[] args)
	{ // 實例化對象
		Fenzhuang a2 = new Fenzhuang();
		a2.setName("陈传磊");
		a2.setAge(200);
		Fenzhuang.add = "藍京";
		System.out.println("名字：" + a2.getName() + ",年龄:" + a2.getAge() + ",地址：" + Fenzhuang.add);
	}
}
