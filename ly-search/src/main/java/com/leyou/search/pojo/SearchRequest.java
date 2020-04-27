package com.leyou.search.pojo;

public class SearchRequest {
    private String key;
    private Integer page;
    private static final Integer DEFAULT_PAGE = 20;
    private static final Integer DEFAULT_SIZES = 20;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return DEFAULT_SIZES;
    }
}
