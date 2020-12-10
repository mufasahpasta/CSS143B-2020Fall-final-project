package edu.uwb.css143b2020fall.service;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class IndexerImpl implements Indexer {
    public Map<String, List<List<Integer>>> index(List<String> docs) {
        Map<String, List<List<Integer>>> indexes = new HashMap<>();
        HashSet<String> uniqueWord = new HashSet<String>();
        for (String s : docs) {
            String[] sa = s.trim().split("\\s+");
            for (String st : sa) {
                if (!(st.equals(" ") || st.isEmpty())) {
                    uniqueWord.add(st);
                }
            }
        }
        int count = 0;
        for (String s : docs) {
            for (String sa : uniqueWord) {
                String[] str = s.trim().split("\\s+");
                List<Integer> l1 = new ArrayList<Integer>();
                for (int i = 0; i < str.length; i++) {
                    if (str[i].equals(sa)) {
                        l1.add(i);
                    }
                }
                if (indexes.containsKey(sa)) {
                    List<List<Integer>> l = indexes.get(sa);
                    l.add(l1);
                } else {
                    List<List<Integer>> l = new ArrayList<List<Integer>>();
                    for (int i = 0; i < count; i++) {
                        l.add(new ArrayList<>());
                    }
                    l.add(l1);
                    indexes.put(sa, l);
                }
            }
            count++;
        }
        return indexes;
    }
}