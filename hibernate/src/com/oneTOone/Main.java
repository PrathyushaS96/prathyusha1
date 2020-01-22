package com.oneTOone;
import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  


public class Main {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernateStudent.xml").build();  
	    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
	      
	    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
	    Session session=factory.openSession();  
	      
	    Transaction t=session.beginTransaction();   
	      
	    Student e1=new Student(); 
	    
	    
	    
	        
	    Address address1 = new Address("Ashok Nagar", "Vijayawada", "AP", "520007");
		Address address2 = new Address("Santhi Nagar", "Eluru", "AP", "520006");
		Student student1 = new Student("Prathyusha", address1);
		Student student2 = new Student("Joe", address2);
		session.save(student1);
		session.save(student2);
		t.commit();

	    session.close();    
	    System.out.println("success");    

	}

}

