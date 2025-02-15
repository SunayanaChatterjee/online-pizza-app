package com.cg.ja18.onlinepizzaapp.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.ja18.onlinepizzaapp.entity.Customer;
import com.cg.ja18.onlinepizzaapp.entity.Pizza;


@Service
public interface ICustomerService {
	
	 Customer addCustomer(Customer customer);  

	 Customer updateCustomer(Long customerId,Customer customer);
    
	 List<Pizza> viewPizzaList();

}