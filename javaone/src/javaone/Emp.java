package javaone;

public class Emp
{
	String name;
	double gongzi;
	
    void jiaqian()
    {   //ע��ֲ����������� �� �� �� ֵ��
    	//����ʱ һ �� Ҫ �� ֵ ! ! !
    	double jiaxin=100;
    	gongzi+=jiaxin;
    	System.out.println("Ա����"+name+"����н��"+jiaxin+"���ܹ��ʣ�"+gongzi);
    }
    public static void main(String[] args)
	{
		Emp one=new Emp();
		one.name="����Т";
		one.gongzi=1000;
		one.jiaqian();
		
		Emp two=new Emp();
		two.name="���";
		two.gongzi=10000;
		two.jiaqian();
	}
}
