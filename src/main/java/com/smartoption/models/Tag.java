/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartoption.models;


public class Tag {
    private String Key;
    private int Count;

    /**
     * @return the Key
     */
    public String getKey() {
        return Key;
    }

    /**
     * @param Key the Key to set
     */
    public void setKey(String Key) {
        this.Key = Key;
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
}
