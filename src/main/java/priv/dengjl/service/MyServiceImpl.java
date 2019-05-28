/**
 * <p>Title: MyServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2018</p>
 * <p>Company: Ericsson</p>
 * @author dengjili
 * @date 2019年5月29日
 * @version 1.0
 */
package priv.dengjl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import priv.dengjl.controller.PagerController;

/**
 * <p>Title: MyServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: Ericsson</p> 
 * @author    dengjili
 * @date      2019年5月29日 上午12:07:01
 */
@Service
public class MyServiceImpl implements MyService {

	@Override
	public String toMessage() {
		return "toMessage";
	}
	@Override
	public void print() {
		System.out.println("adsfadsfs");
	}

	@Override
	public void test() {
		System.out.println("test");
	}

}
