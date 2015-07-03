package com.fitrax.nutritionix4j.client.dto;

public class SearchResults
{

    private int total;
    private float max_score;
    private SearchItem[] hits;

    public int getTotal()
    {
        return total;
    }

    public void setTotal(int total)
    {
        this.total = total;
    }

    public float getMax_score()
    {
        return max_score;
    }

    public void setMax_score(float max_score)
    {
        this.max_score = max_score;
    }

    public SearchItem[] getHits()
    {
        return hits;
    }

    public void setHits(SearchItem[] hits)
    {
        this.hits = hits;
    }

}