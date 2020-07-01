import java.io.File;
import java.io.FilenameFilter;

public class Example2 {

	public static void main(String[] args) {
		String dir = "/Users/VISHAL/temp";
		String extension = ".doc";
		findFiles(dir, extension);
	}

	private static void findFiles(String dir, String extension) {
		File file = new File(dir);
		if (!file.exists())
			System.out.println(dir + " Directory doesn't exists");
		File[] listFiles = file.listFiles(new MyFileNameFilter(extension));
		 File[] listFiles1 = file.listFiles((d, s) -> {
		 return s.toLowerCase().endsWith(extension);
		 });

		if (listFiles1.length == 0) {
			System.out.println(dir +" doesn't have any file with extension " + extension);
		} else {
			for (File f: listFiles1)
				System.out.println("File: " + dir + File.separator + f.getName());
		}
	}

	// FileNameFilter implementation
	public static class MyFileNameFilter implements FilenameFilter {

		private String extension;

		public MyFileNameFilter(String extension) {
			this.extension = extension.toLowerCase();
		}

		@Override
		public boolean accept(File dir, String name) {
			return name.toLowerCase().endsWith(extension);
		}

	}

}