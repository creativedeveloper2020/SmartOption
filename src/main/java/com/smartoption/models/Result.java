/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartoption.models;

import java.util.ArrayList;
import java.util.List;


public class Result {
    private String KeySearch;
    private int Count;
    private List<Tag> Tags=new ArrayList<>();
    private List<ResultItem> Results=new ArrayList<>();

    /**
     * @return the KeySearch
     */
    public String getKeySearch() {
        return KeySearch;
    }

    /**
     * @param KeySearch the KeySearch to set
     */
    public void setKeySearch(String KeySearch) {
        this.KeySearch = KeySearch;
    }

    /**
     * @return the Count
     */
    public int getCount() {
        return Count;
    }

    /**
     * @param Count the Count to set
     */
    public void setCount(int Count) {
        this.Count = Count;
    }

    /**
     * @return the Tags
     */
    public List<Tag> getTags() {
        return Tags;
    }

    /**
     * @param Tags the Tags to set
     */
    public void setTags(List<Tag> Tags) {
        this.Tags = Tags;
    }

    /**
     * @return the Results
     */
    public List<ResultItem> getResults() {
        return Results;
    }

    /**
     * @param Results the Results to set
     */
    public void setResults(List<ResultItem> Results) {
        this.Results = Results;
    }
}
