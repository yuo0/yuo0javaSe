package javaone;

public class Fenzhuang
{   //˽�л�
    private String name;
    private int age;
    
    static String add;
    
    //���b���ֵķ���
    public void setName(String name)
    {
    	this.name=name;
    }
    public  String getName()
    {
    	return name;
    }
    
    //���b���g�ķ���
    public void setAge(int age)
    {
    	if(age>0 && age<=130)
    	{
    		this.age=age;
    	}
    	else
    	{
    		System.out.println("��Ϲд���g");
    	}
    	    
    }
    public int getAge()
    {
    	if(age>0 && age<=130)
    	{
    		return this.age;
    	}
    	
    	else
    	{
    		return 0;
    	}
    	
    }
    
}
