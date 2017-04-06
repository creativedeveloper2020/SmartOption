/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartoption;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

public class NewMain {
 
   public static final String BING_SEARCH_URL = "http://www.bing.com/search";
   public static  final String UClassifer_url="http://uclassify.com/browse/uClassify/Topics/ClassifyText?readkey=";//VlwyNkdvwOTo&text=apple";
   public  static  final String classiferkey="VlwyNkdvwOTo";


     
     public static void getres3(String s) throws Exception 
     {
       
        String searchURL = BING_SEARCH_URL + "?q=" + s + "&count=" + 10;
        org.jsoup.nodes.Document doc = Jsoup.connect(searchURL).userAgent("Mozilla/5.0").get();
        org.jsoup.select.Elements result = doc.select("li.b_algo");
        for (org.jsoup.nodes.Element res : result) {
            Element e=res.child(0).child(0).child(0);
            String linkHref = e.attr("href");
            String title=e.text();

            Element e2=res.child(1).child(1);
            String snipper=e2.text();
            System.out.println( "title: "+title );
            System.out.println( linkHref );
            System.out.println( snipper );
            classifer(snipper);
            
}
}   
     public static void classifer(String str) throws Exception {
        String url= UClassifer_url+classiferkey+"&text="+str;
        org.jsoup.nodes.Document doc = Jsoup.connect(url).get();
        for (Element e : doc.select("class")) {
            System.out.println(e);
        }
     } 
    public static void main(String[] args) throws Exception {
        String word="apple";
       getres3(word);
	}

}
