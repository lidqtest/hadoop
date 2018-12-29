package udf;

import java.util.Date;

import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.util.MD5Hash;
import org.apache.hadoop.hive.ql.exec.UDF;
 
public class HashMd5 extends UDF {
public void printLog(){
    	System.out.println(new Date() + "######## lidq by md5######");
    }
public String evaluate(String cookie) {
return MD5Hash.getMD5AsHex(Bytes.toBytes(cookie));
}
}