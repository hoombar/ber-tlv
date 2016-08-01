package net.rdyonline.bertlv;

import java.util.ArrayList;
import java.util.List;

/**
 * This code is really rough around the edges, but hopefully it illustrates that I have the capacity
 * to understand the BER-TLV format and can source information for myself
 */
public class Parser {

    private String mData;

    public List<Entry> parseData(String data) {
        mData = data.replace(" ", "");

        List<Entry> entrySet = new ArrayList<>();

        // not optimised due to time constraints
        int i = 0;
        while (mData.length() > 0 && i <= Tags.getLongestTagLength()) {
            String eval = mData.substring(0, i);
            if (Tags.getKnownTags().contains(eval)) {
                String tag = takeNext(i);
                Entry entry = extractData(tag);
                entrySet.add(entry);
                i = 0;
            }

            i++;
        }

        return entrySet;
    }

    private Entry extractData(String tag) {
        String length = takeNext(2);
        int byteSize = Integer.parseInt(length, 16);
        String data = takeNext(byteSize * 2);

        Entry entry = new Entry(tag, byteSize, data);

        return entry;
    }

    private String takeNext(int next) {
        String result = mData.substring(0, next);

        mData = mData.substring(next);

        return result;
    }
}
