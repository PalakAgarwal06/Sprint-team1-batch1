package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entities.Offices;

import com.example.demo.exception.OfficeNotFoundException;

import com.example.demo.repository.OfficesRepository;

public class OfficeServiceImpl implements OfficeService {

	@Autowired
	OfficesRepository orepo;

	@Override

	public Offices createOffice(Offices office) {

		return orepo.save(office);

	}

	@Override

	public List<Offices> getAllOffices(Offices offices) {

		return orepo.findAll();

	}

	@Override

	public Offices updateOffices(Offices office) throws OfficeNotFoundException {

		if (orepo.findById(office.getCode()).isEmpty()) {

			throw new OfficeNotFoundException("Office with given id not found");

		}

		else {

			return orepo.save(office);

		}

	}

	@Override

	public Offices getOfficebyId(int code) throws OfficeNotFoundException {

		if (orepo.findById(code).isEmpty()) {

			throw new OfficeNotFoundException("Office with given id not found");

		}

		else {

			return orepo.findById(code).get();

		}

	}

	@Override

	public void deleteOffices(int code) throws OfficeNotFoundException {

		if (orepo.findById(code).isEmpty()) {

			throw new OfficeNotFoundException("Office with given id not found");

		}

		else {

			orepo.deleteById(code);

		}

	}

}