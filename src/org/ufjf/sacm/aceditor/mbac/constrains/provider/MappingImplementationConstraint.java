package org.ufjf.sacm.aceditor.mbac.constrains.provider;


import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.ufjf.sacm.aceditor.extension.IDirectTypeInformation;
import org.ufjf.sacm.aceditor.mbac.constrains.provider.view.DefineQueryController;
import org.ufjf.sacm.aceditor.sacm2.ImplementationConstraint;
import org.ufjf.sacm.aceditor.sacm2.ModelElement;
import org.ufjf.sacm.aceditor.sacm2.Term;
import org.ufjf.sacm.aceditor.sacm2.figures.util.interfaces.IModelElementImplementationConstraintPainter;
import org.ufjf.sacm.aceditor.sacm2.util.others.TypeInformation;
import org.ufjf.sacm.aceditor.sacm2.validation.extension.IImplementationConstraintValidator;

public class MappingImplementationConstraint  implements IImplementationConstraintValidator,IDirectTypeInformation,IModelElementImplementationConstraintPainter {
	@Override
	public String validate(ModelElement modelElement, ImplementationConstraint implementationConstraint) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeInformation getTypeInformation(Object element, String modelPath) {
		if(element instanceof Term) {
			DefineQueryController controller = new DefineQueryController();
			if(controller.openDialog()) {
				return new TypeInformation("EOL", controller.getQuery());
			}
		}
		return null;
	}
	
	
	@Override
	public void paint(IFigure figure, Graphics graphics) {
		
	}
}
