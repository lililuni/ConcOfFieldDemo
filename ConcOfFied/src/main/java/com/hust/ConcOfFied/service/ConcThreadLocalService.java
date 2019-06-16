
package com.hust.ConcOfFied.service;

import org.springframework.stereotype.Service;

/**
* @Description 
* @since  2019年6月16日 上午11:30:07
* @author LiuLiBin
*/
@Service
public class ConcThreadLocalService {
		
	//private int i
	
		// 定义 ThreadLocal 对象i ，区别于上面的int i
		private static ThreadLocal<Integer> i = new ThreadLocal<Integer>() {
			@Override
			// 初始化 i
			protected Integer initialValue() {
				return 0;
			}
		};

		public void add() {
			i.set(getI() + 1);

		}

		public int getI() {
			// 分装一层，调用ThreadLocal对象  i 的 get()方法
			return i.get();
		}

		public void setI(int ii) {
			// 分装一层，调用ThreadLocal对象  i 的 set()方法
			i.set(ii);
		}

}
