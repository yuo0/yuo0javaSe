package javaone;

public class Db
{

	String host;

	String username;

	String userpwd;

	String url;

	// 1.һ���������û���κι��캯����Java����������ʽ�Զ��ṩһ��û�в����Ĺ��캯������������ʹ��
	// 2.���һ�������ṩ�˹��캯�������������������������캯��

	// ���캯������:�����е����Խ��г�ʼ����ֵ
	public Db(String host, String username, String userpwd, String url)
	{

		this.host = host;
		this.username = username;
		this.userpwd = userpwd;
		this.url = url;

		System.out.println("�в����Ĺ��캯��");
	}

	public Db()
	{

		System.out.println("û�в����Ĺ��캯��");
	}

	public static void main(String[] args)
	{
		// ���һ�����ж�����캯������ô�͸����������ṩ�˶�����ʻ���
		// ������캯���γ������أ�ͬһ������������ͬ��ʵ�ֽ��
		Db d1 = new Db();

	}

}
