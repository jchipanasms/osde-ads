package context;

import helpers.XMLHelperMobile;

public class ContextManagerMobile {

	public static void putObject(){
        XMLHelperMobile.preObjectsMobile.add(new PreObjectsMobile(XMLHelperMobile.object));
    }
}
