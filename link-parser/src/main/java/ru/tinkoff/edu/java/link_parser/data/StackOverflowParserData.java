package ru.tinkoff.edu.java.link_parser.data;

public class StackOverflowParserData implements ParserData {
    private int questionId;

    private StackOverflowParserData() {
    }

    public StackOverflowParserData(int questionId) {
        this.questionId = questionId;
    }

    public int getQuestionId() {
        return questionId;
    }

    @Override
    public String toString() {
        return "StackOverflowParserData{" +
                "questionId=" + questionId +
                '}';
    }
}
