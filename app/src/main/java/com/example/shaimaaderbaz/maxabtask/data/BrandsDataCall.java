package com.example.shaimaaderbaz.maxabtask.data;

import com.example.shaimaaderbaz.maxabtask.data.models.BrandItem;

import java.util.List;

/**
 * Created by Shaimaa Derbaz on 4/9/2019.
 */

public interface BrandsDataCall {
    void success(List<BrandItem> brandItems);

    void error(String error);
}
