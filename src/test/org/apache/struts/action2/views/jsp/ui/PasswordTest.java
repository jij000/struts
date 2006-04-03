/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
package org.apache.struts.action2.views.jsp.ui;

import org.apache.struts.action2.TestAction;
import org.apache.struts.action2.views.jsp.AbstractUITagTest;


/**
 * @author Matt Ho <a href="mailto:matt@enginegreen.com">&lt;matt@enginegreen.com&gt;</a>
 * @version $Id$
 */
public class PasswordTest extends AbstractUITagTest {

    public void testSimple() throws Exception {
        TestAction testAction = (TestAction) action;
        testAction.setFoo("bar");

        PasswordTag tag = new PasswordTag();
        tag.setPageContext(pageContext);
        tag.setLabel("mylabel");
        tag.setName("myname");
        tag.setTitle("mytitle");

        tag.doStartTag();
        tag.doEndTag();

        verify(PasswordTag.class.getResource("Password-1.txt"));
    }

    public void testGenericSimple() throws Exception {
        PasswordTag tag = new PasswordTag();
        verifyGenericProperties(tag, "simple", new String[]{"value"});
    }

    public void testGenericXhtml() throws Exception {
        PasswordTag tag = new PasswordTag();
        verifyGenericProperties(tag, "xhtml", new String[]{"value"});
    }

    public void testGenericAjax() throws Exception {
        PasswordTag tag = new PasswordTag();
        verifyGenericProperties(tag, "ajax", new String[]{"value"});
    }

}
