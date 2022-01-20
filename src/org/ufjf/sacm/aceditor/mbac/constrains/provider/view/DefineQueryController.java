package org.ufjf.sacm.aceditor.mbac.constrains.provider.view;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.PlatformUI;

public class DefineQueryController implements Listener{
	private DefineQueryDialog queryDialog;
	private String query;
	
	public DefineQueryController() {
		queryDialog = new DefineQueryDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
		queryDialog.create();
		queryDialog.getQuery().addListener(SWT.Modify, this);
	}
	
	public boolean openDialog() {
		if(queryDialog.open()==Window.OK) {
			return true;
		};
		return false;

	}
	@Override
	public void handleEvent(Event event) {
		if(event.type==SWT.Modify && event.widget==queryDialog.getQuery()) {
			query=queryDialog.getQuery().getText();
		}
		
	}
	
	public String getQuery() {
		return query;
	}
}	
