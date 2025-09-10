package com.practice.leetcode.daily;

import java.util.HashSet;
import java.util.Set;

public class MinimumNumberOfPeopleToTeach {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> usersToTeach = new HashSet<>();

        for(int [] f: friendships) {
            int u1 = f[0] - 1, u2 = f[1] - 1;
            boolean flag = false;
            for(int lang1: languages[u1]) {
                for(int lang2: languages[u2]) {
                    if(lang1== lang2) {
                        flag = true;
                        break;
                    }
                }
                if(flag) break;
            }
            if(!flag) {
                usersToTeach.add(u1);
                usersToTeach.add(u2);
            }
        }
        int min = languages.length + 1;
        for(int lang = 1; lang <= n; lang++) {
            int count = 0;
            for(int user: usersToTeach) {
                boolean knows = false;
                for(int l: languages[user]) {
                    if(l == lang) {
                        knows = true;
                        break;
                    }
                }
                if(!knows) count++;
            }
            min = Math.min(min, count);
        }
        return min;
    }
}
