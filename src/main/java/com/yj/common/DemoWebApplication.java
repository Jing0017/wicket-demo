package com.yj.common;

import com.yj.page.Home;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * <p>
 * Title :
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Author :严靖 23/03/2017
 * </p>
 * <p>
 * Department :
 * </p>
 * Copyright :  </p>
 */
public class DemoWebApplication extends WebApplication {
    @Override
    public Class<? extends Page> getHomePage() {
        return Home.class;
    }

    @Override
    public void init() {
        super.init();
        // add your configuration here
    }
}
