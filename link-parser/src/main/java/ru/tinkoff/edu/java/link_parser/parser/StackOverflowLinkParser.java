package ru.tinkoff.edu.java.link_parser.parser;

import ru.tinkoff.edu.java.link_parser.data.StackOverflowParserData;
import ru.tinkoff.edu.java.link_parser.data.ParserData;

public class StackOverflowLinkParser extends LinkParser {

    private static final String HOST = "https://stackoverflow.com/questions";

    @Override
    public ParserData parse(String link) {
        if (link.startsWith(HOST)) {
            var data = link.split("/");
            if (data.length == 5 || data.length == 6)
                return new StackOverflowParserData(Integer.parseInt(data[4]));
        }
        return null;
    }
}
