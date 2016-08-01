package net.rdyonline.bertlv;

public class Main {

    /***
     * Due to time constraits, there is no output. You can see in the tests that the solution will
     * inspect nested tags for the BER-TLV format.
     *
     */
    public static void main(String[] args) {


        Parser parser = new Parser();
        parser.parseData(args[0]);
    }

}
