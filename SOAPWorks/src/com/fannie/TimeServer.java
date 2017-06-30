		+package com.fannie;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//cntrl+shift+o for import
@WebService
@SOAPBinding(style = Style.RPC)
public interface TimeServer {

	public @WebMethod String getTimeAsString();

	public @WebMethod String getServerName(String name);

	public @WebMethod String getCompanyName();
	@WebMethod
	public String checkCreditScore(String custName, int creditScore);

}
