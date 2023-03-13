package ru.tinkoff.edu.java.link_parser;


import ru.tinkoff.edu.java.link_parser.parser.LinkParser;
import ru.tinkoff.edu.java.link_parser.parser.StackOverflowLinkParser;
import ru.tinkoff.edu.java.link_parser.data.StackOverflowParserData;
import ru.tinkoff.edu.java.link_parser.parser.GithubLinkParser;
import ru.tinkoff.edu.java.link_parser.data.GithubParserData;

public class Main {
    public static void main(String[] args) {
        var link = "https://stackoverflow.com/questions/1642028/";

        var linkParser = LinkParser.getEmpty();
        var githubLinkParser = new GithubLinkParser();
        var stackOverflowLinkParser = new StackOverflowLinkParser();

        linkParser.setNextLinkParser(githubLinkParser);
        githubLinkParser.setNextLinkParser(stackOverflowLinkParser);

        var parserData = linkParser.linkManager(link);

        if (parserData instanceof GithubParserData git) {
            System.out.println(git);
        } else if (parserData instanceof StackOverflowParserData stack) {
            System.out.println(stack);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
