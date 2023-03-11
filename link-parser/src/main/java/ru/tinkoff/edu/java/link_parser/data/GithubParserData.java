package ru.tinkoff.edu.java.link_parser.data;

public class GithubParserData implements ParserData {
    private String user;
    private String repository;

    private GithubParserData() {
    }

    public GithubParserData(String user, String repository) {
        this.user = user;
        this.repository = repository;
    }

    public String getUser() {
        return user;
    }

    public String getRepository() {
        return repository;
    }

    @Override
    public String toString() {
        return "GithubParserData{" +
                "user='" + user + '\'' +
                ", repository='" + repository + '\'' +
                '}';
    }
}
