package com.example.shaimaaderbaz.maxabtask.data;

import com.example.shaimaaderbaz.maxabtask.data.models.CategoryItem;

import java.util.List;

/**
 * Created by Shaimaa Derbaz on 4/9/2019.
 */

public interface CategoriesDataCall {
    void success(List<CategoryItem> categoryItems);

    void error(String error);
}
