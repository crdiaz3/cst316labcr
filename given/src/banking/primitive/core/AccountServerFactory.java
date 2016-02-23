/*
  File:	AccountServerFactory.java
  Author:	@author kevinagary
  Date:	2/22/2016

  Description: Factory used to generate AccountServers.
*/
package banking.primitive.core;


public class AccountServerFactory {

	private static AccountServerFactory singleton = null;

	protected AccountServerFactory() {

	}

	public static AccountServerFactory getMe() {
		if (singleton == null) {
			singleton = new AccountServerFactory();
		}

		return singleton;
	}

	public AccountServer lookup() {
		return new ServerSolution();
	}
}
