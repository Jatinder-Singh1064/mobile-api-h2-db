package com.my.demo.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.my.demo.entity.Mobile;
import com.my.demo.service.MobileService;

@RestController
@RequestMapping("/api")
public class MobileController {
	
	@Autowired
	MobileService mobileService;
	
	@GetMapping("/list")
	public List<Mobile> getMobiles() {
		return mobileService.getMobiles();
	}
	
	@GetMapping("/{id}")
	public Optional<Mobile> getMobile(@PathVariable(name = "id") long mobileId) {
		return mobileService.getMobile(mobileId);
	}
	
	@PostMapping("/")
	public Mobile saveMobile(@RequestBody Mobile mobile) {
		return mobileService.saveMobile(mobile);
	}
	
	@PutMapping("/update")
	public void updateMobile(@RequestBody Mobile newMobile) {
		mobileService.updateMobile(newMobile);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMobile(@PathVariable(name = "id") long id) {
		mobileService.deleteMobile(id);
	}

}
