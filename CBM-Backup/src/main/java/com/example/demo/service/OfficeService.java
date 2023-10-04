package com.example.demo.service;

 

import java.util.List;
import com.example.demo.entities.Offices;
import com.example.demo.exception.OfficeNotFoundException;

 

public interface OfficeService {

	Offices createOffice(Offices office);

	List<Offices> getAllOffices(Offices offices);

	Offices updateOffices(Offices office) throws OfficeNotFoundException;

	Offices getOfficebyId(int code) throws OfficeNotFoundException;

	void deleteOffices(int code) throws OfficeNotFoundException;

 

}