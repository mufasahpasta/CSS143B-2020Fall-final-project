package edu.uwb.css143b2020fall.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class SearcherImpl implements Searcher {
    public List<Integer> search(String keyPhrase, Map<String, List<List<Integer>>> index) {
        List<Integer> result = new ArrayList<>();
        int count = 0;
        String[] st = keyPhrase.trim().split("\\s+");
        if (st.length == 1) {
            List<List<Integer>> list = index.get(st[0]);
            if (list == null) {
                return new ArrayList<Integer>();
            }
            for (List l : list) {
                if (l.size() > 0) {
                    result.add(count);
                }
                count++;
            }

        } else {
            List<List<List<Integer>>> rlist = new ArrayList<List<List<Integer>>>();
            boolean notFound = false;
            for (String s : st) {
                List<List<Integer>> list = index.get(s);
                if (list == null || list.size() == 0) {
                    result = new ArrayList<>();
                    notFound = true;
                    break;
                } else {
                    rlist.add(list);
                }
            }
            if (!notFound) {
                int size = rlist.get(0).size();
                for (int i = 0; i < size; i++) {
                    int min = -1;
                    int min2 = -1;
                    boolean notF = false;
                    List<Integer> li = new ArrayList<>();
                    for (List<List<Integer>> rl : rlist) {
                        for (Integer k : rl.get(i)) {
                            if (min < k) {
                                min = k;
                                li.add(min);
                                break;
                            }
                        }
                        if (min2 == min) {
                            notF = true;
                            break;
                        }
                        min2 = min;
                    }
                    if (!notF) {
                        notF = true;
                        int k = li.get(0);
                        for (int m = 0; m < li.size(); m++) {
                            if (k == li.get(m)) {
                                k++;
                            } else {
                                notF = false;
                            }
                        }
                        if (notF) {
                            result.add(i);
                        }
                    }
                }
            }
        }
        return result;


    }
}



/*

        //Step 1: Split keyPhrase into words

        //Step 2: Get the documents that have the words that are searched
        //{0,1,3,4,5} ... {0,2,3,4,5}

        //Step 3: Find common numbers between both lists

        //Step 4: Find out if words are right next to each other in given order
        //get the location of each word in each common document
        //If location difference is 1, and in correct order, than they are next to each other

 */