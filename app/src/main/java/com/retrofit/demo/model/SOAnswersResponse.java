package com.retrofit.demo.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SOAnswersResponse {
 
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    @SerializedName("has_more")
    @Expose
    private Boolean hasMore;
    @SerializedName("backoff")
    @Expose
    private Integer backoff;
    @SerializedName("quota_max")
    @Expose
    private Integer quotaMax;
    @SerializedName("quota_remaining")
    @Expose
    private Integer quotaRemaining;
 
    public List<Item> getItems() {
        return items;
    }
 
    public void setItems(List<Item> items) {
        this.items = items;
    }
 
    public Boolean getHasMore() {
        return hasMore;
    }
 
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }
 
    public Integer getBackoff() {
        return backoff;
    }
 
    public void setBackoff(Integer backoff) {
        this.backoff = backoff;
    }
 
    public Integer getQuotaMax() {
        return quotaMax;
    }
 
    public void setQuotaMax(Integer quotaMax) {
        this.quotaMax = quotaMax;
    }
 
    public Integer getQuotaRemaining() {
        return quotaRemaining;
    }
 
    public void setQuotaRemaining(Integer quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

   /* {
        "items": [
        {
            "owner": {
            "reputation": 1,
                    "user_id": 6540831,
                    "user_type": "registered",
                    "profile_image": "https://www.gravatar.com/avatar/6a468ce8a8ff42c17923a6009ab77723?s=128&d=identicon&r=PG&f=1",
                    "display_name": "bobolafrite",
                    "link": "http://stackoverflow.com/users/6540831/bobolafrite"
        },
            "is_accepted": false,
                "score": 0,
                "last_activity_date": 1480862271,
                "creation_date": 1480862271,
                "answer_id": 40959732,
                "question_id": 35931342
        },
        {
            "owner": {
            "reputation": 629,
                    "user_id": 3054722,
                    "user_type": "registered",
                    "profile_image": "https://www.gravatar.com/avatar/0cf65651ae9a3ba2858ef0d0a7dbf900?s=128&d=identicon&r=PG&f=1",
                    "display_name": "jeremy-denis",
                    "link": "http://stackoverflow.com/users/3054722/jeremy-denis"
        },
            "is_accepted": false,
                "score": 0,
                "last_activity_date": 1480862260,
                "creation_date": 1480862260,
                "answer_id": 40959731,
                "question_id": 40959661
        },
    ...
  ],
        "has_more": true,
            "backoff": 10,
            "quota_max": 300,
            "quota_remaining": 241
    }*/
}