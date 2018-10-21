package java_dome09;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList2 {

	/**
	 * @param args
	 */
	//�����ڲ���ʵ��
	public static FilenameFilter filter(final String regex) {
		//�����ڲ�������Ҫ��÷����еĲ�����������Ϊfinalȫ�ֱ����������ڲ�����ܻ�ȡ��������Ĳ���
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
//		ͨ����java ���������ݲ��������ж��ļ��Ƿ��ڸ�Ŀ¼��
		String list[] ;
		if(args.length == 0)
			list = path.list();//�����ļ����б�
		else {
		list = path.list(filter(args[0]));
		}
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for(String string : list)
			System.out.println(string);

	}

}
