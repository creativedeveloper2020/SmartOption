/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartoption.api;

import com.smartoption.SmartOptionEngine;
import com.smartoption.models.Result;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
    @RequestMapping("/Engine")
    public Result greeting(@RequestParam(value="Search", defaultValue="World") String keySearch,
           @RequestParam(value="Tag", defaultValue="All") String tag,
           @RequestParam(value="Count", defaultValue="10")int count ) {
        return SmartOptionEngine.SmartSearch(keySearch, count,tag);
    }
}
