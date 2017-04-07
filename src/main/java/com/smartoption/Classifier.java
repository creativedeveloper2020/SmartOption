/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartoption;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;


public class Classifier {
     static  final String UClassifer_url="http://uclassify.com/browse/uClassify/Topics/ClassifyText?readkey=";//VlwyNkdvwOTo&text=apple";
     static  final String classiferkey="VlwyNkdvwOTo";

     public static String Classify(String str) throws Exception {
        String url= UClassifer_url+classiferkey+"&text="+str;
        org.jsoup.nodes.Document doc = Jsoup.connect(url).get();
        String tag="N/A";
        float val=-1;
        for (Element e : doc.select("class")) {
            if (Float.valueOf(e.attr("p"))>val){
           tag= e.attr("className");
           val=Float.valueOf(e.attr("p"));
            }
        }
        return tag;
     } 
}
