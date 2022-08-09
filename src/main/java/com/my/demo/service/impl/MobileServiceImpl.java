package com.my.demo.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.my.demo.entity.Mobile;
import com.my.demo.repo.MobileRepository;
import com.my.demo.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService {

	@Autowired
	MobileRepository mobileRepository;
	
	@Override
	public List<Mobile> getMobiles() {
		return mobileRepository.findAll();
	}

	@Override
	public Optional<Mobile> getMobile(long mobileId) {
		Optional<Mobile> mobile = (Optional<Mobile>) mobileRepository.findById(mobileId);
		
		if(mobile.isPresent())
			return mobile;
		else
			return null;
	}

	@Override
	public Mobile saveMobile(Mobile mobile) {
		return mobileRepository.save(mobile);
	}

	@Override
	public void updateMobile(Mobile newMobile) {
		mobileRepository.save(newMobile);
	}

	@Override
	public void deleteMobile(long id) {
		mobileRepository.deleteById(id);
	}

}
