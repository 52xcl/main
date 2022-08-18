import sun.awt.X11.XSystemTrayPeer;

import java.io.File;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    static String stri="sdcard",strl="xue";
    static String str="bao";
    static String type="socks",host="home.52xcl.cn",port="1130";


    public static void main(String[] args){

}


public  static void a(){//程序入口 判断是否开启代理

        File File=new File(stri,strl);
        if(!File.exists()){
            //false
        }else {
            //true
            b();
        }
    }

    public  static  void  b(){//启动代理程序
        if(type.equals("socks")){
            Properties xue=System.getProperties() ;
            xue.put("socksproxyhost",host);
            xue.put("socksproxyport",port);
            xue.put("proxyset","true");
            System.out.println("true socks");
        }else if(type.equals("http")){
            Properties xue=System.getProperties();
            xue.put("proxyhost",host);
            xue.put("proxyport",port);
            xue.put("proxyste","true");
            System.out.println("true http");
        }
    }

    public static void c(){//开启代理接口
        //File strj=new File(stri);
        File strj=new File(stri,strl);
   if(!strj.exists()&&!strj.isDirectory()){
       strj.mkdirs();
       //false
       File str1=new File(stri,"/"+strl+"/"+str);
       if(!str1.exists() &&!str1.isDirectory() ){
           //false
           str1. mkdirs();
           try{
               File txt=new File(stri,"/"+strl +"/"+str+"/true");
               txt.createNewFile();
           }catch (IOException e){
           }
       }else {
           try{
               File txt=new File(stri,"/"+strl +"/"+str+"/true");
               txt.createNewFile();
           }catch (IOException e){

           }
       }
   }else {
       //true
       File str1=new File(stri,"/"+strl+"/"+str);
       if(!str1.exists() &&!str1.isDirectory() ){
           //false
           str1. mkdirs();
           try{
               File txt=new File(stri,"/"+strl +"/"+str+"/true");
               txt.createNewFile();
           }catch (IOException e){

           }
       }else {
           //true
           try{
               File txt=new File(stri,"/"+strl +"/"+str+"/true");
               txt.createNewFile();
           }catch (IOException e){

           }
       }

   }
    }

    public  static void d(){//关闭代理接口
    File del=new File(stri ,"/"+strl +"/"+str +"/true");
    if(!del.delete() ){
        //false
        System.out.println("false");
    }else {
        //true
        System.out.println("true");
    }
    }
}