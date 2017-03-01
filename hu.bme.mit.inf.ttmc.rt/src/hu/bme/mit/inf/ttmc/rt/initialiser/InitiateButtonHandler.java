package hu.bme.mit.inf.ttmc.rt.initialiser;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

import TTMCHybrid.HybridSpecification;
import hu.bme.mit.inf.ttmc.hybrid.verification.HybridVerifier;
import hu.bme.mit.inf.ttmc.hybrid.verification.HybridVerifier;

public class InitiateButtonHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			IEditorInput input = window.getActivePage().getActiveEditor().getEditorInput();
			
			if (input instanceof FileEditorInput) {
				FileEditorInput editorInput = (FileEditorInput) input;
				IFile file = editorInput.getFile();
				ResourceSet resSet = new ResourceSetImpl();
				Resource resource;
				try{
				resource = resSet.getResource(
					URI.createPlatformResourceURI(file.getFullPath().toString(), true),true);
				}catch(RuntimeException exception) {
					showErrorMessage("Can not load the source file!", event);
					return null;
				}
				EObject root = resource.getContents().get(0);
				HybridSpecification sys = (HybridSpecification) root;
				HybridVerifier hvf = new HybridVerifier();
				hvf.verify(sys);
				System.out.println("Rebus says: :)");
				
			}
			else showErrorMessage("Can not detect the source file!",event);
		}
		else showErrorMessage("There isn't any active window!",event);
		
		return null;
	}

	private IFolder createWorkFolder(IFile configfile) throws CoreException {
		
		IContainer container = configfile.getParent();
		
		String[] segment = configfile.getProjectRelativePath().segments();
		String folderName = segment[segment.length-1];
		folderName = folderName.substring(0, folderName.lastIndexOf('.'));
		
		NullProgressMonitor monitor = new NullProgressMonitor();
		
		IFolder workFolder;
		
		if (container instanceof IFolder) {
			IFolder folder = (IFolder) container;
			workFolder = folder.getFolder(folderName);
		}
		else if(container instanceof IProject) {
			IProject project = (IProject) container;
			workFolder = project.getFolder(folderName);
		}
		else {
			throw new CoreException(null);
		}
		
		if(workFolder.exists())	workFolder.delete(true, monitor);
		workFolder.create(true, true, monitor);
		
		return workFolder;
	}
	
	/**
	 * Static method that shows an error message to the user
	 * @param errorMessage
	 */
	public static void showErrorMessage(String errorMessage, ExecutionEvent event) {
		System.out.println(errorMessage);
		//MessageDialog.openInformation(HandlerUtil.getActiveEditor(event), "Gebasz", errorMessage);
	}
	
	public static void write(String s) {
		System.out.println(s);
	}
}
