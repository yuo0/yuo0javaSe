package javaone;

public class StuOne
{
	//����
	String name;
	//����
	byte age;
	//У��
	static String xiaoming;
	//����������
	static int shuliang;
     public static void main(String[] args)
	{
		StuOne one=new StuOne();
		one.name="����Т";
		one.age=22;
		one.xiaoming="�ϴ�";
		one.shuliang=99999;
		System.out.println(one.name+one.age+one.xiaoming+one.shuliang);
		
		StuOne two=new StuOne();
		two.name="����";
		two.age=11;
	    one.xiaoming="��ְ��";
		System.out.println("   ,"+two.name+two.age+two.xiaoming+one.shuliang);
		System.out.println(one.name+one.age+xiaoming+one.shuliang);
	}
}
