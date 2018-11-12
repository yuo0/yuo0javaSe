package javaone;

public class Fenzhuang
{   //私有化
    private String name;
    private int age;
    
    static String add;
    
    //封裝名字的方法
    public void setName(String name)
    {
    	this.name=name;
    }
    public  String getName()
    {
    	return name;
    }
    
    //封裝年齡的方法
    public void setAge(int age)
    {
    	if(age>0 && age<=130)
    	{
    		this.age=age;
    	}
    	else
    	{
    		System.out.println("别瞎写年齡");
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
