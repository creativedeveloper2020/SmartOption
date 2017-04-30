/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartoption;

import com.smartoption.models.Result;
import com.smartoption.models.ResultItem;
import com.smartoption.models.UnclassifiedResultItem;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SmartOptionEngine {
    public static Result SmartSearch(String keySearch,int size,String Tag){
        Classifier classifier=new Classifier();
        Result result=new Result();
        result.setKeySearch(keySearch);
        result.setCount(size);
        List<UnclassifiedResultItem> li;
        try {
             li=BingSearchEngine.Search(keySearch, size);
             int idx=0;
             for(UnclassifiedResultItem item:li){
                 idx++;
            String tag=classifier.Classify(item.getSnippit());
            if (Tag.equalsIgnoreCase("All")|| Tag.equalsIgnoreCase(tag)){
            result.getResults().add(new ResultItem(idx,item.getTitle(),item.getUrlRef(),item.getSnippit(),tag));
            }
            }
        } catch (Exception ex) {
            Logger.getLogger(SmartOptionEngine.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        result.setTags(classifier.getTagsResult());
     return result;
    }
}
