/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartoption.models;

/**
 *
 * @author Ahmad
 */
public class ResultItem {
   private int Rank;
   private String Title;
   private String UrlRef;
   private String Snippit;
   private String Category;

    /**
     * @return the Rank
     */
    public int getRank() {
        return Rank;
    }

    /**
     * @param Rank the Rank to set
     */
    public void setRank(int Rank) {
        this.Rank = Rank;
    }

    /**
     * @return the Title
     */
    public String getTitle() {
        return Title;
    }

    /**
     * @param Title the Title to set
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * @return the UrlRef
     */
    public String getUrlRef() {
        return UrlRef;
    }

    /**
     * @param UrlRef the UrlRef to set
     */
    public void setUrlRef(String UrlRef) {
        this.UrlRef = UrlRef;
    }

    /**
     * @return the Snippit
     */
    public String getSnippit() {
        return Snippit;
    }

    /**
     * @param Snippit the Snippit to set
     */
    public void setSnippit(String Snippit) {
        this.Snippit = Snippit;
    }

    /**
     * @return the Category
     */
    public String getCategory() {
        return Category;
    }

    /**
     * @param Category the Category to set
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }
}
