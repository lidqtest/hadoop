package udf;

import java.util.Date;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class UdfTest extends UDF{
	
    public void printLog(){
    	System.out.println(new Date() + "######## lidq by bigthan######");
    }
    public boolean evaluate(){
        return true;
    }

    public boolean evaluate(int b){
        if(b<0){
            return false;
        }
        if(b%2==0){
            return true;
        }else {
            return false;
        }

    }

    public boolean evaluate(String a){
        int b=Integer.parseInt(a);

        if(b<0){
            return false;
        }
        if(b%2==0){
            return true;
        }else {
            return false;
        }

    }

    public boolean evaluate(Text a){
        int b=Integer.parseInt(a.toString());

        if(b<0){
            return false;
        }
        if(b%2==0){
            return true;
        }else {
            return false;
        }

    }
    public boolean evaluate(Text t1,Text t2){
    //public boolean evaluate(String t1, String t2){     
         if(t1==null || t2 ==null){
             return false;
         }

         double d1 = Double.parseDouble(t1.toString());
         double d2 = Double.parseDouble(t2.toString());
         if(d1>d2){
             return true;
         }else{
             return false;
         }   
    }



    public boolean evaluate(String t1, String t2){   
         if(t1==null || t2 ==null){
             return false;
         }

         double d1 = Double.parseDouble(t1);
         double d2 = Double.parseDouble(t2);
         if(d1>d2){
             return true;
         }else{
             return false;
         }   
    }
    public boolean evaluate(int t1, int t2){
        if("null".equals(String.valueOf(t1)) || "0".equals(String.valueOf(t1))  || "null".equals(String.valueOf(t2)) || "0".equals(  String.valueOf(t2)) ){
            return false;
        }
        if(t1>t2){
            return true;
        }else{
            return false;
        }   
   }
}