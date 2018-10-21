package java_dome09;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("D:/javaio/DirList");
//		args = new String[]{"DirList0.txt"};
//		通过向java 主函数传递参数，来判断文件是否在该目录下
		String list[] ;
		if(args.length == 0)
			list = path.list();//返回文件的列表
		else {
		list = path.list(new DirFilter(args[0]));
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String string : list)
			System.out.println(string);
		File[] files = path.listFiles();
				for(File file : files)
					System.out.println(file);

	}

}


//java正则表达式
//实现FilenameFilter 中accept() 方法
class DirFilter implements FilenameFilter {

	private Pattern pattern;
	//要使用的字符串 regex
	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return pattern.matcher(name).matches();
	}
	
}