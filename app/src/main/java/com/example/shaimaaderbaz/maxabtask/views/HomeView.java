package com.example.shaimaaderbaz.maxabtask.views;

import com.example.shaimaaderbaz.maxabtask.data.models.BrandItem;
import com.example.shaimaaderbaz.maxabtask.data.models.CategoryItem;

import java.util.List;

/**
 * Created by Shaimaa Derbaz on 4/8/2019.
 */

public interface HomeView {
    void showBrands(List<BrandItem> AllBrands);
    void showCategoris(List<CategoryItem> AllCategories);
}
