package com.Himraj.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/count-items-matching-a-rule/description/
public class MatchingTheRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>() {
            {
                add(Arrays.asList("phone", "blue", "pixel"));
                add(Arrays.asList("computer", "silver", "phone"));
                add(Arrays.asList("phone", "gold", "silver"));
            }
        };

        System.out.println(countMatches(items, "type", "phone"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        // ruleKey-> type = 0, ruleKey-> color = 1, ruleKey-> name = 2.
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type")) {
                if (items.get(i).getFirst().equals(ruleValue)) ans += 1;
            }

            if (ruleKey.equals("color")) {
                if (items.get(i).get(1).equals(ruleValue)) ans += 1;
            }

            if (ruleKey.equals("name")) {
                if (items.get(i).getLast().equals(ruleValue)) ans += 1;
            }

        }

        return ans;
    }
}
