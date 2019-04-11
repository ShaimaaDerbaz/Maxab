package com.example.shaimaaderbaz.maxabtask.data;

import java.util.List;

/**
 * Created by Shaimaa Derbaz on 4/9/2019.
 */

public interface Repository<T> {
    List<T> getPage(int page);
}
