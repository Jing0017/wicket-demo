package com.yj.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * <p>
 * Title :
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Author :严靖 22/03/2017
 * </p>
 * <p>
 * Department :
 * </p>
 * Copyright :  </p>
 */
public class Home extends WebPage {

    public Home() {
        add(new Label("helloMessage", "Hello WicketWorld!"));
    }
}
