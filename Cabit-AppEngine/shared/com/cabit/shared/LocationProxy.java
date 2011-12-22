package com.cabit.shared;

import java.util.Date;

import com.google.web.bindery.requestfactory.shared.ProxyForName;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

@ProxyForName(value = "com.cabit.server.Location", locator = "com.cabit.server.LocationLocator")
public interface LocationProxy extends ValueProxy {

	Date getDate();

	void setDate(Date date);

	String getUserEmail();

	void setUserEmail(String userEmail);

	int getLatitude();

	void setLatitude(int latitude);

	int getLongitude();

	void setLongitude(int longitude);

}