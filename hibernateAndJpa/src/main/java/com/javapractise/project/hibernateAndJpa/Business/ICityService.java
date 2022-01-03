package com.javapractise.project.hibernateAndJpa.Business;

import java.util.List;

import com.javapractise.project.hibernateAndJpa.Entities.City;

// Business katmanında dal kısmından farklı metotlar olabileceği için ICityDal yerine bu interface i yazdık

public interface ICityService {
	List<City> getAll();

	void add(City city);

	void update(City city);

	void delete(City city);
	
	City getById(int id);
}
