package java_dome09;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class Directory {

	/**
	 * @param args
	 */
	
	public static File[] local(File dir, final String regex) {
		return dir.listFiles(new FilenameFilter() {
			
			Pattern pattern = Pattern.compile(regex);
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return pattern.matcher(new File(name).getName()).matches();
			}
		});
	
	}
	public static File[] local(String path, final String regex) {
		return local(new File(path) , regex);
	
	}
	
	public static class TreeInfo implements Iterable<File> {

		public List<File> files = new ArrayList<File>();
		public List<File> dirs = new ArrayList<File>();
		
		@Override
		public Iterator<File> iterator() {
			// TODO Auto-generated method stub
			return files.iterator();
		}
		
		void addAll(TreeInfo other) {
			files.add((File) other.files);
			dirs.add((File) other.files);
		}
		public String toString() {
			return "q" + dirs + "w" + files;
		}
	}
	
	public static TreeInfo walk(String start ,String regex) {
		return recurseDire(new File(start), regex);
	}
	
	public static TreeInfo walk(File start ,String regex) {
		return recurseDire(start , regex);
	}
	public static TreeInfo walk(File start) {
		return recurseDire(start , ".*");
	}
	
	public static TreeInfo walk(String start ) {
		return recurseDire(new File(start), ".*");
	}
	
	static TreeInfo recurseDire(File startDir , String regex) {
		TreeInfo result = new TreeInfo();
		for(File item : startDir.listFiles()){
			if(item.isDirectory()) {//判断文件是否为文件夹
				result.dirs.add(item);
			    result.addAll(recurseDire(item, regex));//进行递归遍历
			} else 
				if(item.getName().matches(regex))
					result.files.add(item);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(walk("D:/javaio/DirList"));

	}

}
