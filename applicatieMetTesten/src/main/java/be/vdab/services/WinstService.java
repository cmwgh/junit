package be.vdab.services;
import java.math.BigDecimal;
import be.vdab.repositories.KostRepository;
import be.vdab.repositories.OpbrengstRepository;

public class WinstService {
	private final OpbrengstRepository opbrengstRepository;
	private final KostRepository kostRepository;
	public WinstService(OpbrengstRepository opbrengstRepository,
			KostRepository kostRepository) {
		this.opbrengstRepository = opbrengstRepository;
		this.kostRepository = kostRepository;
	}
	public BigDecimal getWinst(){
		return opbrengstRepository.findTotaleOpbrengst()
				.subtract(kostRepository.findTotaleKost());
		//throw new UnsupportedOperationException();
	}
}
