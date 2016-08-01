package net.rdyonline.bertlv;

import java.util.List;

public class Entry {

    private String tag;
    private int numBytes;
    private String data;

    public Entry(String tag, int numBytes, String data) {
        this.tag = tag;
        this.numBytes = numBytes;
        this.data = data;
    }

    public String getTag() {
        return tag;
    }

    public int getNumBytes() {
        return numBytes;
    }

    public String getData() {
        return data;
    }

    public List<Entry> getNestedEntries() {
        // if there's a nested entry
        List<Entry> entries = new Parser().parseData(data);

        if (entries.size() == 0) return null;

        return entries;
    }

}
