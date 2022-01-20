package org.ufjf.sacm.aceditor.mbac.constrains.provider.view;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.layout.GridData;

public class DefineQueryDialog  extends  TitleAreaDialog {

	public DefineQueryDialog(Shell parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
	}

	protected Shell shell;
	private Text query;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	public Text getQuery() {
		return query;
	}


	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setTitle("Inform Query");
		Composite area = (Composite) super.createDialogArea(parent);
		
		Composite composite = formToolkit.createComposite(area, SWT.NONE);
		composite.setLayout(new FormLayout());
		GridData gd_composite = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_composite.widthHint = 394;
		gd_composite.heightHint = 254;
		composite.setLayoutData(gd_composite);
		
		query = formToolkit.createText(composite,"",SWT.BORDER | SWT.WRAP);
		FormData fd_query = new FormData();
		fd_query.bottom = new FormAttachment(100, -10);
		fd_query.right = new FormAttachment(0, 384);
		fd_query.top = new FormAttachment(0, 10);
		fd_query.left = new FormAttachment(0, 10);
		query.setLayoutData(fd_query);
		
		return area;
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(400, 402);
	}
	
	@Override
	protected boolean isResizable() {
		return false;
	}
}
