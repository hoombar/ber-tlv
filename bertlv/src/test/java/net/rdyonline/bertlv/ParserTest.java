package net.rdyonline.bertlv;

import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ParserTest {

    Parser mParser = new Parser();

    @Test
    public void checkSimpleData() {
        String data = "5A 08 56 78 90 12 34 56 78 90 5F 24 02 08 13";

        List<Entry> entries = mParser.parseData(data);

        Entry firstEntry = entries.get(0);
        assertEquals("5A", firstEntry.getTag());
        assertEquals(8, firstEntry.getNumBytes());
        assertEquals("5678901234567890", firstEntry.getData());

        Entry secondEntry = entries.get(1);
        assertEquals("5F24", secondEntry.getTag());
        assertEquals(2, secondEntry.getNumBytes());
        assertEquals("0813", secondEntry.getData());
    }

    // the BER-TLV format is similar to simple TLV, but allows nested entries
    @Test
    public void checkNestedData() {
        String data = "77 0F 5A 08 56 78 90 12 34 56 78 90 5F 24 02 08 13";

        List<Entry> topLevelEntry = mParser.parseData(data);
        List<Entry> entries = topLevelEntry.get(0).getNestedEntries();

        Entry firstEntry = entries.get(0);
        assertEquals("5A", firstEntry.getTag());
        assertEquals(8, firstEntry.getNumBytes());
        assertEquals("5678901234567890", firstEntry.getData());

        Entry secondEntry = entries.get(1);
        assertEquals("5F24", secondEntry.getTag());
        assertEquals(2, secondEntry.getNumBytes());
        assertEquals("0813", secondEntry.getData());
    }

}