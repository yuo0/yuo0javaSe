package javaone;

public class Dog
{
	private String name;
	private String color;

	// ��ʾ����ëɫ�ķ���
	public void xianshi()
	{ // this��ʾ��ǰ����˭����this�ʹ���˭��this����ʹ���ھ�̬����
		System.out.println(this.name + "����ɫ��" + this.color);
	}

	public static void main(String[] args)
	{
		// this�������ھ�̬������!!!

		Dog d1 = new Dog();
		d1.name = "Lastؼ��";
		d1.color = "��ɫ";
		d1.xianshi();

		Dog d2 = new Dog();
		d2.name = "������";
		d2.color = "�ڰ�";
		d2.xianshi();
	}

}
