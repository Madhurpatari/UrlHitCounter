package com.Geekster.URL_hit_Counter.Service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;


@Service
public class UrlHitService {
    private Map<String, Integer> hitCounts = new HashMap<>();

    public int getHitCount() {
        // Get the username from the request context (or any other way you prefer)
        String username = "default";
        Integer count = hitCounts.getOrDefault(username, 0);
        hitCounts.put(username, count + 1);
        return count + 1;
    }

    public int getHitCountForUser(String username) {
        return hitCounts.getOrDefault(username, 0);
    }
}
