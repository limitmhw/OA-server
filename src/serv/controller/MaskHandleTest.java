package serv.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MaskHandleTest {
	private static MaskHandle cc = new MaskHandle();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsExist() {
		
		if(cc.isExist("0101", "0001")){
			System.out.println("验证通过");
		}else{
			System.out.println("验证失败");
		}
		if(cc.isExist("0001", "0100")){
			System.out.println("验证通过");
		}else{
			System.out.println("验证失败");
		}
		if(cc.isExist("0001", "01011")){
			System.out.println("验证通过");
		}else{
			System.out.println("验证失败");
		}
		
		System.out.println(cc.toStringMask(1));
		System.out.println(cc.toStringMask(2));
		System.out.println(cc.toStringMask(3));
		System.out.println(cc.toStringMask(4));
		System.out.println(cc.toStringMask(6));
		
		fail("Not yet implemented");
	}

}
