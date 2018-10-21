package java_dome09;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2 {

	/**
	 * @param args
	 */
	//匿名内部类实现
	public static FilenameFilter filter(final String regex) {
		//匿名内部类中若要获得方法中的参数，必须设为final全局变量，这样内部类才能获取类类以外的参数
		return new FilenameFilter() {
			
			private Pattern pattern = Pattern.compile(regex);
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return pattern.matcher(name).matches();
			}
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File path = new File("D:/javaio/DirList");
//		args = new String[]{"DirList0.txt"};
//		通过向java 主函数传递参数，来判断文件是否在该目录下
		String list[] ;
		if(args.length == 0)
			list = path.list();//返回文件的列表
		else {
		list = path.list(filter(args[0]));
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String string : list)
			System.out.println(string);

	}

}
