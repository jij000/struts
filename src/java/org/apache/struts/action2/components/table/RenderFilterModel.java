/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
package org.apache.struts.action2.components.table;

import javax.swing.table.TableModel;


/**
 * @author $author$
 * @version $Revision$
 */
public class RenderFilterModel extends AbstractFilterModel {

	private static final long serialVersionUID = -2501708467650344057L;
	
	private boolean rendered;


    public RenderFilterModel(TableModel tm) {
        super(tm);
    }


    public void setRendered(boolean rendered) {
        this.rendered = rendered;
    }

    public boolean isRendered() {
        return rendered;
    }
}
