package oop;

public class Bird {
public static int legs;
public static int wings;
public String birdName;
public String birdColor;
private boolean singStatus;
public Bird()
{
	legs=2;
	wings=2;
}
public void setsingingStatus()
{
	if(this.birdName.equalsIgnoreCase("Kokila"))
	{
		singStatus=true;
	}
}
public void walk()
{
System.out.println(birdColor+" "+birdName+" is walking with "+legs+" legs.");	
}
public void fly()
{
System.out.println(birdColor+" "+birdName+" is flying with "+wings+" wings.");	
}
public void sing()
{
	if(singStatus)
	{
		System.out.println("la ra looo..la ra loo...");
		
	}else
	{
		System.out.println("can't sing!!!");
	}
}
}
