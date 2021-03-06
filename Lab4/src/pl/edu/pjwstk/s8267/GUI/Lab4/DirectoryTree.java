package pl.edu.pjwstk.s8267.GUI.Lab4;

import java.io.File;

public class DirectoryTree {


	private static void show(String string) {
		show(new File(string), "");
	}

	private static void show(File file, String prefix) {
		if(file.isDirectory()) {
			System.out.println(file.getName());
			File[] files = file.listFiles();
			String p;
			for(int i = 0; i < files.length; i++) {
				if(i+1 < files.length && files[i+1].isDirectory())
					p = prefix + "|   ";
				else
					p = prefix + "    ";
				if(files[i].isDirectory()) {
					System.out.print(prefix+"+---");
					show(files[i], p);
				}
			}
		}
	}

	public static void main(String args[]) {
		DirectoryTree.show("/home/PJWSTK/s8267/zet/projects/GUI/Lab4");
	}
}
