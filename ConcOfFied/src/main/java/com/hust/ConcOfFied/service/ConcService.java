
package com.hust.ConcOfFied.service;

import org.springframework.stereotype.Service;

/**
* @Description 
* @since  2019年6月16日 上午11:31:37
* @author LiuLiBin
*/

@Service
public class ConcService {
	private int i;
	
	public void addi() {
		i++;
	}
	
	public int getI() {
		return i;
	}
}
