
package com.hust.ConcOfFied.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hust.ConcOfFied.service.ConcAtomicService;
import com.hust.ConcOfFied.service.ConcService;
import com.hust.ConcOfFied.service.ConcThreadLocalService;
import com.hust.ConcOfFied.service.ConcVolatileService;

/**
* @Description 
* @since  2019年6月16日 上午10:30:26
* @author LiuLiBin
*/
@RestController
@RequestMapping("conc")
public class ConcController {
	
	@Autowired
	private ConcAtomicService concAtomicService;
	@Autowired
	private ConcService concService;
	@Autowired
	private ConcThreadLocalService concThreadLocalService;
	
	@Autowired
	private ConcVolatileService concVolatileService;
	
	/******* 对单例对象的成员变量进行访问 ********/
	@GetMapping("/addiConc")
	public void addiConc() {
		concService.addi();
	}
	
	@GetMapping("/getiConc")
	public int getiConc() {
		return concService.getI();
	}
	
	
	/******* 对单例对象的成员变量（原子类）进行访问 ********/
	@GetMapping("/addiConcAtomic")
	public void addI() {
		concAtomicService.add();
	}
	
	@GetMapping("/getiConcAtomic")
	public int getI() {
		return concAtomicService.getI();
	}
	
	/********** 采用ThreadLocal 实现线程隔离 ********/
	@GetMapping("/addiConcThreadLocal")
	public void addIConcThreadLocal() {
		concThreadLocalService.add();
	}
	
	
	@GetMapping("/getiConcThreadLocal")
	public int getIConcThreadLocal() {
		return concThreadLocalService.getI();
	}
	
	/********** violate 关键字能否保证 i++ 线程安全？ ********/
	@GetMapping("/addiConcVolatile")
	public void addIConcVolatile() {
		concVolatileService.addi();
	}
	
	
	@GetMapping("/getiConcVolatile")
	public int getIConcVolatile() {
		return concVolatileService.getI();
	}
}
