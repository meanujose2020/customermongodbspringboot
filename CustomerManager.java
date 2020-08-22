package com.customer.service;

import java.util.List;

import com.customer.entity.Customer;
import com.customer.entity.CustomerDTO;
import com.vz.cpi.exceptions.AppException;

public interface CustomerManager {

	

	CustomerDTO findByCustomerNumber(Integer studentNumber) throws AppException;

	CustomerDTO saveCustomerDetails(CustomerDTO customerDTO) throws AppException;

    public Customer deleteCustomer(Integer customerNumber) throws AppException;

	List<CustomerDTO> getAllCustomerDetails()throws AppException;

	Customer updateCustomer(Customer customer) throws AppException;

	
}
