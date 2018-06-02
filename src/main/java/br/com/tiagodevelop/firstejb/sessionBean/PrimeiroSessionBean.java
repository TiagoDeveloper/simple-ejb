package br.com.tiagodevelop.firstejb.sessionBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.com.tiagodevelop.firstejb.interfaces.PrimeiroSessionBeanLocal;
import br.com.tiagodevelop.firstejb.interfaces.PrimeiroSessionBeanRemote;

@Stateless
@LocalBean
public class PrimeiroSessionBean implements PrimeiroSessionBeanLocal, PrimeiroSessionBeanRemote{

	public String stateLessSessionBeanMethod(){
		return "Retorno do método..";
	}

	@Override
	public String sayHello(String nome) {
		return "Hello, "+nome;
	}

	@Override
	public String sayGoodBye(String nome) {
		return "Good bye, "+nome;
	}
	
}
