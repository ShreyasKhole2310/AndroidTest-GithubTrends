package com.test.shreyas.test_trending_repositories.Retrofit_class;

import com.test.shreyas.test_trending_repositories.Repository_List;

public class JsonResponse {
        private Repository_List[] items;

    public Repository_List[] getAndroid() {
        return items;
    }

    public void setAndroid(Repository_List[] items) {
        this.items = items;
    }
}
