package main;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;

/**
 * FileChooserPopup is the pop up window of file chooser.
 * @author Zhibo Peng (docp@brandeis.edu)
 *
 */
public class FileChooserPopup extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String folderPath;
	public String folderName;
	public String fileName;
	public String filePath;
	
	/**
	 * choose is used to select file.
	 * @param name is default folder's name.
	 * @param type is the default file type.
	 * @return true if get the file folder's path, false otherwise
	 */
	public boolean choose(String name, String type) {
		this.setSize(600, 400);
		this.setLocation(300, 30);
		String userHome = System.getProperty("user.home");
		JFileChooser fileChooser = new JFileChooser(userHome + "/Desktop/" + name);
		if(type.length() > 0){
			fileChooser.setFileFilter(new NewFileChooser(type));
		}
		int status = fileChooser.showOpenDialog(null);

		if(status == JFileChooser.APPROVE_OPTION){
			File selectedFile = fileChooser.getSelectedFile();
			this.folderPath = selectedFile.getParent();
			this.folderName = selectedFile.getParentFile().getName();
			this.fileName = selectedFile.getName();
			this.filePath = selectedFile.getAbsolutePath();
			return true;
		} 
		else if(status == JFileChooser.CANCEL_OPTION){
			this.folderPath = "";
			this.folderName = "";
			this.fileName = "";
			this.filePath = "";
			return false;
		}
		else{
			this.add(fileChooser);
			this.setVisible(true);
			return false;
		}
	}
	/**
	 * NewFileChooser allows user to define the default type of files they want to show up.
	 * @author Zhibo Peng (docp@brandeis.edu)
	 *
	 */
	private class NewFileChooser extends FileFilter{
		public String type;
		public NewFileChooser(String type){
			this.type = type;
		}
		
		public boolean accept(File f) {
			if (f.isDirectory()){
				return true;
			}
			return f.getName().endsWith("." + this.type);
		} 
		public String getDescription(){
			return "." + this.type;
		}
	}
	public static void main(String[] args){
		FileChooserPopup popup = new FileChooserPopup();
		popup.choose("", "sql");
	}
}
