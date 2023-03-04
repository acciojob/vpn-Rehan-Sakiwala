package com.driver.services;

import com.driver.model.Admin;
import com.driver.model.ServiceProvider;
import com.driver.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface AdminService {

    Admin register(String username, String password);

    Admin addServiceProvider(int adminId, String providerName);

    ServiceProvider addCountry(int serviceProviderId, String countryName) throws Exception;
}