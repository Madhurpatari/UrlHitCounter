package com.Geekster.URL_hit_Counter.Controller;

import com.Geekster.URL_hit_Counter.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "api/v1/visitor-count-app")
public class urlHitCounter {

    @Autowired
    public UrlHitService urlHitService;

    @GetMapping(value = "/count")
    public int getHitCount(){
         return urlHitService.getHitCount();
    }

    @GetMapping("/username/{username}/count")
    public Map<String, Integer> getHitCountForUser(@PathVariable String username) {
        int hitCount = urlHitService.getHitCountForUser(username);
        Map<String, Integer> result = new HashMap<>();
        result.put(username, hitCount);
        return result;
    }
}
