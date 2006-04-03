/*
 * Copyright (c) 2002-2006 by OpenSymphony
 * All rights reserved.
 */
package org.apache.struts.action2.showcase.modelDriven;

import com.opensymphony.xwork.ActionSupport;
import com.opensymphony.xwork.ModelDriven;

/**
 * Action to demonstrate simple model-driven feature of WW.
 * 
 * @author tm_jee
 * @version $Date$ $Id$
 */
public class ModelDrivenAction extends ActionSupport implements ModelDriven {

	private static final long serialVersionUID = 1271130427666936592L;

	public String input() throws Exception {
		return SUCCESS;
	}
	
	public String execute() throws Exception {
		return SUCCESS;
	}

	public Object getModel() {
		return new Gangster();
	}
}
