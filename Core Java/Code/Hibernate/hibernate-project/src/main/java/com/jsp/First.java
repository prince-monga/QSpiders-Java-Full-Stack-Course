
package com.jsp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class First {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("java");
		System.out.println(entityManagerFactory);

	}

}
