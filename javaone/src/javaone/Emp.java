package javaone;

public class Emp
{
	String name;
	double gongzi;
	
    void jiaqian()
    {   //注意局部变量申明可 以 不 赋 值，
    	//调用时 一 定 要 赋 值 ! ! !
    	double jiaxin=100;
    	gongzi+=jiaxin;
    	System.out.println("员工："+name+"，加薪："+jiaxin+"，总工资："+gongzi);
    }
    public static void main(String[] args)
	{
		Emp one=new Emp();
		one.name="刘冬孝";
		one.gongzi=1000;
		one.jiaqian();
		
		Emp two=new Emp();
		two.name="余豪";
		two.gongzi=10000;
		two.jiaqian();
	}
}
