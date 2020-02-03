package com.Naveen.los.operation;

import java.lang.reflect.Array;
import java.util.ArrayList;

import com.Naveen.los.customer.Customer;
import com.Naveen.los.customer.PersonalInformation;

public class DB {
       public static ArrayList<Customer> getNegativeCustomers() {
    	   ArrayList<Customer> negativeCustomers = new ArrayList<>();
    	   Customer customer = new Customer();
    	   customer.setId(1010);
    	   PersonalInformation pd = new PersonalInformation();
    	   pd.setFirstName("Tim");
    	   pd.setLastName("Jackson");
    	   pd.setPhone("22222222");
    	   pd.setPanCard("BW1000");
    	   pd.setVoterId("A111");
    	   pd.setEmail("tim@yahoo.com");
    	   customer.setPersonal(pd);
    	   negativeCustomers.add(customer);
    	   customer = new Customer();
    	   customer.setId(2020);
    	    pd = new PersonalInformation();
    	   pd.setFirstName("Tom");
    	   pd.setLastName("Dahl");
    	   pd.setPhone("3333333");
    	   pd.setPanCard("BW2000");
    	   pd.setVoterId("A222");
    	   pd.setEmail("tom@yahoo.com");
    	   customer.setPersonal(pd);
    	   negativeCustomers.add(customer);
    	   return negativeCustomers;
    	   
       }
}
