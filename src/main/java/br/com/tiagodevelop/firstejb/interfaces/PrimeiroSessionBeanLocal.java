package br.com.tiagodevelop.firstejb.interfaces;

import javax.ejb.Local;

@Local
public interface PrimeiroSessionBeanLocal {

	public String sayHello(String nome);
	public String sayGoodBye(String nome);
}
