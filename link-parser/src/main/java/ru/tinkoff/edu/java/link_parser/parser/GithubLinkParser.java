package ru.tinkoff.edu.java.link_parser.parser;

import ru.tinkoff.edu.java.link_parser.data.GithubParserData;
import ru.tinkoff.edu.java.link_parser.data.ParserData;

public class GithubLinkParser extends LinkParser {

    private static final String HOST = "https://github.com/";

    @Override
    public ParserData parse(String link) {
        if (link.startsWith(HOST)) {
            var data = link.split("/");
            if (data.length == 5)
                return new GithubParserData(data[3], data[4]);
        }
        return null;
    }
}
