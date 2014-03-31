package ChiffresRomainsTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ChiffresRomains.Roman;

public class RomanTest {
	Roman r;
	@Before
	public void setUp() throws Exception {
		r = new Roman();
	}

	@Test
	public void Test_I() {
		assertEquals(1, r.decode("I"));
	}
	@Test
	public void Test_V() {
		assertEquals(5, r.decode("V"));
	}
	@Test
	public void Test_X() {
		assertEquals(10, r.decode("X"));
	}
	@Test
	public void Test_L() {
		assertEquals(50, r.decode("L"));
	}
	@Test
	public void Test_C() {
		assertEquals(100, r.decode("C"));
	}
	@Test
	public void Test_D() {
		assertEquals(500, r.decode("D"));
	}
	@Test
	public void Test_M() {
		assertEquals(1000, r.decode("M"));
	}
	@Test
	public void Test_II(){
		assertEquals(2, r.decode("II"));
	}
	@Test
	public void Test_IIV(){
		assertEquals(3, r.decode("III"));
	}
	@Test
	public void Test_IIX(){
		assertEquals(8, r.decode("VIII"));
	}
	@Test
	public void Test_IX(){
		assertEquals(9, r.decode("IX"));
	}
	@Test
	public void Test_CD(){
		assertEquals(400, r.decode("CD"));
	}
	@Test
	public void Test_CM(){
		assertEquals(900, r.decode("CM"));
	}
	@Test
	public void Test_CCCLXIX(){
		assertEquals(369, r.decode("CCCLXIX"));
	}
	@Test
	public void Test_CDXLVIII(){
		assertEquals(448, r.decode("CDXLVIII"));
	}
	@Test
	public void Test_MCMXCVIII(){
		assertEquals(1998, r.decode("MCMXCVIII"));
	}
}
