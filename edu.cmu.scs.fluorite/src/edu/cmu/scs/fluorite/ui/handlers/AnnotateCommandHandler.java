package edu.cmu.scs.fluorite.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import edu.cmu.scs.fluorite.commands.AnnotateCommand;
import edu.cmu.scs.fluorite.dialogs.AddAnnotationDialog;
import edu.cmu.scs.fluorite.model.EventRecorder;
import edu.cmu.scs.fluorite.dialogs.ViewCurrentLogDialog;

public class AnnotateCommandHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = Display.getDefault().getActiveShell();
		ViewCurrentLogDialog dialog = new ViewCurrentLogDialog(shell,
				EventRecorder.getInstance().getRecordedEventsSoFar(),1);
		dialog.open();
		return null;
	}

}
