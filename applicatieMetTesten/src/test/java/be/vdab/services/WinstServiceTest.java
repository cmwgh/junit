package be.vdab.services;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;
import be.vdab.repositories.KostRepository;
import be.vdab.repositories.KostRepositoryStub;
import be.vdab.repositories.OpbrengstRepository;
import be.vdab.repositories.OpbrengstRepositoryStub;

public class WinstServiceTest {
	private WinstService winstService;
	private OpbrengstRepository opbrengstRepository;
	private KostRepository kostRepository;
	
	@Before
	public void before(){
		opbrengstRepository = new OpbrengstRepositoryStub();
		kostRepository = new KostRepositoryStub();
		winstService = new WinstService(opbrengstRepository, kostRepository);
	}
	@Test
	public void winstIsOpbrengstMinKost() {
		assertEquals(0, BigDecimal.valueOf(31).compareTo(winstService.getWinst()));
	}
}
