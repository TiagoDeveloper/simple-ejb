package br.com.tiagodevelop.firstejb.interfaces;

import javax.ejb.Remote;

@Remote
public interface PrimeiroSessionBeanRemote {

	public String sayHello(String nome);
	public String sayGoodBye(String nome);
}
