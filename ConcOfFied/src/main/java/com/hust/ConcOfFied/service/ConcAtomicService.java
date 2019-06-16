
package com.hust.ConcOfFied.service;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

/**
* @Description 
* @since  2019年6月16日 上午10:28:55
* @author LiuLiBin
*/
@Service
public class ConcAtomicService {
	
	private AtomicInteger i = new AtomicInteger();
	
	public void add() {
		i.incrementAndGet();
	}
	
	
	
	public int getI() {
		return i.intValue();
	}
}
