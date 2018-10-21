package org.springframework.samples.petclinic.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	OwnerRepository repository;
	
	@Override
	public void foo() {
		System.out.println("OwnerServiceImpl.foo()");
	}

}
