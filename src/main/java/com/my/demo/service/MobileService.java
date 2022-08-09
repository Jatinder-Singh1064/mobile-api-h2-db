package com.my.demo.service;

import java.util.List;
import java.util.Optional;

import com.my.demo.entity.Mobile;

public interface MobileService {

	List<Mobile> getMobiles();

	Optional<Mobile> getMobile(long mobileId);

	Mobile saveMobile(Mobile mobile);

	void updateMobile(Mobile newMobile);

	void deleteMobile(long id);
}
