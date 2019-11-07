package MyIO;

import oop.Bird;



public class BirdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bird p=new Bird();
p.birdColor="Green";
p.birdName="Parrot";
p.legs=2;
p.wings=2;
p.walk();
p.setsingingStatus();
p.sing();
p.fly();

Bird k=new Bird();
k.birdColor="black";
k.birdName="kokila";
k.legs=2;
k.wings=2;
k.walk();
k.setsingingStatus();
k.sing();
k.fly();
System.out.println("Object id:"+p.hashCode());
	}

}
