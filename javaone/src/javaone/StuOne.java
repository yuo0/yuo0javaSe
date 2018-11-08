package javaone;

public class StuOne
{
	//名字
	String name;
	//年龄
	byte age;
	//校名
	static String xiaoming;
	//或伤子数量
	static int shuliang;
     public static void main(String[] args)
	{
		StuOne one=new StuOne();
		one.name="刘冬孝";
		one.age=22;
		one.xiaoming="南大";
		one.shuliang=99999;
		System.out.println(one.name+one.age+one.xiaoming+one.shuliang);
		
		StuOne two=new StuOne();
		two.name="玩了";
		two.age=11;
	    one.xiaoming="二职中";
		System.out.println("   ,"+two.name+two.age+two.xiaoming+one.shuliang);
		System.out.println(one.name+one.age+xiaoming+one.shuliang);
	}
}
