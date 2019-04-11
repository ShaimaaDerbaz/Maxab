package com.example.shaimaaderbaz.maxabtask.data;

import com.example.shaimaaderbaz.maxabtask.data.models.CategoryItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaimaa Derbaz on 4/9/2019.
 */

public class CategoriessRepositry implements Repository<CategoryItem> {
    List<CategoryItem> data = new ArrayList<>();

    public CategoriessRepositry() {


            CategoryItem categoryItem = new CategoryItem();
            categoryItem.setName("مياه معدنية");
            categoryItem.setIcon("https://cdn.iconscout.com/icon/premium/png-256-thumb/water-bottle-24-581662.png");
            categoryItem.setImage("https://data.arab48.com/data/news/2016/08/18/Croped/20160818134544.jpg");
            data.add(0, categoryItem);

            CategoryItem categoryItem1 = new CategoryItem();
            categoryItem1.setName("منظفات");
            categoryItem1.setIcon("https://cdn.iconscout.com/icon/premium/png-256-thumb/water-bottle-24-581662.png");
            categoryItem1.setImage("https://modo3.com/thumbs/fit630x300/138669/1479314275/%D8%B5%D9%86%D8%A7%D8%B9%D8%A9_%D8%A7%D9%84%D9%85%D9%86%D8%B8%D9%81%D8%A7%D8%AA_%D8%A7%D9%84%D9%83%D9%8A%D9%85%D9%8A%D8%A7%D8%A6%D9%8A%D8%A9.jpg");
            data.add(1, categoryItem1);

        CategoryItem categoryItem2 = new CategoryItem();
        categoryItem2.setName("طحينة");
        categoryItem2.setIcon("https://cdn.iconscout.com/icon/premium/png-256-thumb/water-bottle-24-581662.png");
        categoryItem2.setImage("https://www.ma7shy.com/media/cache/image_seo/uploads/media/%D8%B7%D8%AD%D9%8A%D9%86%D9%87_1449065440.jpg");
        data.add(2, categoryItem2);

        CategoryItem categoryItem3 = new CategoryItem();
        categoryItem3.setName("شاي");
        categoryItem3.setIcon("https://cdn.iconscout.com/icon/premium/png-256-thumb/water-bottle-24-581662.png");
        categoryItem3.setImage("https://mediaaws.almasryalyoum.com/news/large/2018/02/03/775642_0.jpg");
        data.add(3, categoryItem3);

        CategoryItem categoryItem4 = new CategoryItem();
        categoryItem4.setName("خل");
        categoryItem4.setIcon("https://cdn.iconscout.com/icon/premium/png-256-thumb/water-bottle-24-581662.png");
        categoryItem4.setImage("https://www.hiamag.com/sites/default/files/styles/ph2_960_600/public/article/02/08/2016/4440816-1288411407.jpg");
        data.add(4, categoryItem4);

        CategoryItem categoryItem5 = new CategoryItem();
        categoryItem5.setName("العناية الشخصية");
        categoryItem5.setIcon("https://cdn.iconscout.com/icon/premium/png-256-thumb/water-bottle-24-581662.png");
        categoryItem5.setImage("https://modo3.com/thumbs/fit630x300/79681/1452091786/%D8%A3%D8%AF%D9%88%D8%A7%D8%AA_%D8%A7%D9%84%D9%86%D8%B8%D8%A7%D9%81%D8%A9_%D8%A7%D9%84%D8%B4%D8%AE%D8%B5%D9%8A%D8%A9.jpg");
        data.add(5, categoryItem5);

        CategoryItem categoryItem6 = new CategoryItem();
        categoryItem6.setName("مكرونة");
        categoryItem6.setIcon("https://cdn.iconscout.com/icon/premium/png-256-thumb/water-bottle-24-581662.png");
        categoryItem6.setImage("http://gate.ahram.org.eg/Media/News/2018/1/31/19_2018-636530087633255472-325.jpg");
        data.add(6, categoryItem6);

        CategoryItem categoryItem7 = new CategoryItem();
        categoryItem7.setName("بهارات");
        categoryItem7.setIcon("https://cdn.iconscout.com/icon/premium/png-256-thumb/water-bottle-24-581662.png");
        categoryItem7.setImage("http://www.boltonmarkets.com/wp-content/uploads/2016/11/spices.jpg");
        data.add(7, categoryItem7);

    }

    public List<CategoryItem> getData() {
        return data;
    }

    public void setData(List<CategoryItem> data) {
        this.data = data;
    }

    @Override
    public List<CategoryItem> getPage(int page) {
        int itemsPerPage = 4;
        if (page * itemsPerPage >= data.size()) {
            return new ArrayList<>();
        }
        List<CategoryItem> subItems = new ArrayList<>();
        for (int i = 0; (i < data.size() - page * itemsPerPage & i < 4); i++) {
            CategoryItem categoryItem;
            int start = (itemsPerPage * page)+i;
            categoryItem = data.get(start);
            subItems.add(categoryItem);

        }
        return subItems;
    }
}
