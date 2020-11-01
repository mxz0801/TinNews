package com.example.tinnews.model;

import java.util.List;
import java.util.Objects;

public class NewsResponse {
    public Integer totalResults;
    public List<Article> articles;
    public String status;
    public String code;
    public String message;

    @Override
    public String toString() {
        return "NewsResponse{" +
                "totalResults=" + totalResults +
                ", articles=" + articles +
                ", status='" + status + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsResponse that = (NewsResponse) o;
        return Objects.equals(totalResults, that.totalResults) &&
                Objects.equals(articles, that.articles) &&
                Objects.equals(status, that.status) &&
                Objects.equals(code, that.code) &&
                Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalResults, articles, status, code, message);
    }
}
