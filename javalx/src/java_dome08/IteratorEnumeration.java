package java_dome08;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Random;

/*
 * ���Էֱ�ͨ�� Iterator �� Enumeration ȥ����Hashtable
 * @author skywang
 */
public class IteratorEnumeration {

    public static void main(String[] args) {
        int val;
        Random r = new Random();
        Hashtable table = new Hashtable();
        for (int i=0; i<1000000; i++) {
            // �����ȡһ��[0,100)֮�������
            val = r.nextInt(100);
            table.put(String.valueOf(i), val);
        }

        // ͨ��Iterator����Hashtable
        iterateHashtable(table) ;

        // ͨ��Enumeration����Hashtable
        enumHashtable(table);
    }
    
    /*
     * ͨ��Iterator����Hashtable
     */
    private static void iterateHashtable(Hashtable table) {
        long startTime = System.currentTimeMillis();

        Iterator iter = table.entrySet().iterator();
        while(iter.hasNext()) {
            //System.out.println("iter:"+iter.next());
            iter.next();
        }

        long endTime = System.currentTimeMillis();
        countTime(startTime, endTime);
    }
    
    /*
     * ͨ��Enumeration����Hashtable
     */
    private static void enumHashtable(Hashtable table) {
        long startTime = System.currentTimeMillis();

        Enumeration enu = table.elements();
        while(enu.hasMoreElements()) {
            //System.out.println("enu:"+enu.nextElement());
            enu.nextElement();
        }

        long endTime = System.currentTimeMillis();
        countTime(startTime, endTime);
    }

    private static void countTime(long start, long end) {
        System.out.println("time: "+(end-start)+"ms");
    }
}