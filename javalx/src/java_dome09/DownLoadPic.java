package java_dome09;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class DownLoadPic {

    private static final String saveImgPath="D://imgs";
    //ͼƬ����·��
 
    public void getDoc() throws IOException{
        ArrayList<String> ar = new ArrayList<String>();
        int n=0;
        String s;
        try {
        	while(n<=3){
        		s="http://manhua.fzdm.com/22/681/index_"+n+".html";
        		Document doc = Jsoup.connect(s).
        				userAgent("Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.64 Safari/537.31")
        				.get();
        		//��ȡ��׺Ϊpng��jpg��ͼƬ��Ԫ�ؼ���
        		Elements pngs=null;
        		pngs = doc.select("img[src~=(?i)\\.jpg]");
        		System.out.println(pngs);
        		for(Element e : pngs){
        			String src=e.attr("src");//��ȡimg�е�src·��
        			if(src.indexOf("http:")<0)
        				src="http:"+src;
        			ar.add(src);
        			break;
        		}
        		n++;
        	}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
        //����Ԫ��
        System.out.println(ar);
        int imageName=0;
        for(String e : ar){
            imageName=imageName+1;
            System.out.print(e+"\n");
            URL url = new URL(e);
            URLConnection uri=url.openConnection();
            //��ȡ������
            InputStream is=uri.getInputStream();
            //д��������
            OutputStream os = new FileOutputStream(new File(saveImgPath, imageName+".jpg"));
            byte[] buf = new byte[1024];
            int l=0;
            while((l=is.read(buf))!=-1){
                os.write(buf, 0, l);
                os.flush();
            }
        }


        }


    public static void main(String[] args) throws IOException {
    	
        new DownLoadPic().getDoc(); //���÷���
    }
}