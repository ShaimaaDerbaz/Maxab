package com.example.shaimaaderbaz.maxabtask.data;

import com.example.shaimaaderbaz.maxabtask.data.models.BrandItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shaimaa Derbaz on 4/9/2019.
 */

public class BrandsRepositry implements Repository<BrandItem> {

    List<BrandItem> data = new ArrayList<>();

    public BrandsRepositry() {
        BrandItem brandItem = new BrandItem();
        brandItem.setImage("https://www.expressoplus.com/ep/wp-content/uploads/2018/11/nescafe-coffee-to-go-logo.jpg");
        data.add(0,brandItem);
        BrandItem brandItem1 = new BrandItem();
        brandItem1.setImage("https://foodline.com.gr/wp-content/uploads/2017/12/logo.png");
        data.add(1,brandItem1);
        BrandItem brandItem2 = new BrandItem();
        brandItem2.setImage("https://graintogain.com/wp-content/uploads/2016/06/fayrouz-arabic-logo.png");
        data.add(2,brandItem2);
        BrandItem brandItem3 = new BrandItem();
        brandItem3.setImage("https://upload.wikimedia.org/wikipedia/ar/f/f7/Schweppes_logo.png");
        data.add(3,brandItem3);
        BrandItem brandItem4 = new BrandItem();
        brandItem4.setImage("https://pbs.twimg.com/profile_images/3059130222/66130dbbcf0b69b630985e1de87ef59e_400x400.jpeg");
        data.add(4,brandItem4);
        BrandItem brandItem5 = new BrandItem();
        brandItem5.setImage("http://www.chocolate-brands.com/image/cache/catalog/heinz-logo-600x315.jpg");
        data.add(5,brandItem5);
        BrandItem brandItem6= new BrandItem();
        brandItem6.setImage("https://www.e3melbusiness.com/assets/images/success-story-Marzouga(1).png");
        data.add(6,brandItem6);
        BrandItem brandItem7 = new BrandItem();
        brandItem7.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSU_JNjXc3uxrXMpXXp4LPB6CVJzjZrGY86A902eSyRf_CeHGpCiw");
        data.add(7,brandItem7);
        BrandItem brandItem8 = new BrandItem();
        brandItem8.setImage("http://afiatopchef.com/img/afia_logo.png");
        data.add(8,brandItem8);
        BrandItem brandItem9 = new BrandItem();
        brandItem9.setImage("http://pngimg.com/uploads/water_bottle/water_bottle_PNG10147.png");
        data.add(9,brandItem9);
        BrandItem brandItem10 = new BrandItem();
        brandItem10.setImage("https://foodline.com.gr/wp-content/uploads/2017/12/logo.png");
        data.add(10,brandItem10);
        BrandItem brandItem11 = new BrandItem();
        brandItem11.setImage("https://graintogain.com/wp-content/uploads/2016/06/fayrouz-arabic-logo.png");
        data.add(11,brandItem11);
        BrandItem brandItem12 = new BrandItem();
        brandItem12.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSU_JNjXc3uxrXMpXXp4LPB6CVJzjZrGY86A902eSyRf_CeHGpCiw");
        data.add(12,brandItem12);
        BrandItem brandItem13 = new BrandItem();
        brandItem13.setImage("http://pngimg.com/uploads/water_bottle/water_bottle_PNG10147.png");
        data.add(13,brandItem13);
        BrandItem brandItem14 = new BrandItem();
        brandItem14.setImage("http://afiatopchef.com/img/afia_logo.png");
        data.add(14,brandItem14);
        BrandItem brandItem15 = new BrandItem();
        brandItem15.setImage("https://foodline.com.gr/wp-content/uploads/2017/12/logo.png");
        data.add(15,brandItem15);
        BrandItem brandItem16 = new BrandItem();
        brandItem16.setImage("http://www.chocolate-brands.com/image/cache/catalog/heinz-logo-600x315.jpg");
        data.add(16,brandItem16);
        BrandItem brandItem17 = new BrandItem();
        brandItem17.setImage("https://www.e3melbusiness.com/assets/images/success-story-Marzouga(1).png");
        data.add(17,brandItem17);
        BrandItem brandItem18 = new BrandItem();
        brandItem18.setImage("https://graintogain.com/wp-content/uploads/2016/06/fayrouz-arabic-logo.png");
        data.add(18,brandItem18);
        BrandItem brandItem19 = new BrandItem();
        brandItem19.setImage("https://upload.wikimedia.org/wikipedia/ar/f/f7/Schweppes_logo.png");
        data.add(19,brandItem19);
        BrandItem brandItem20 = new BrandItem();
        brandItem20.setImage("https://pbs.twimg.com/profile_images/3059130222/66130dbbcf0b69b630985e1de87ef59e_400x400.jpeg");
        data.add(20,brandItem20);
        BrandItem brandItem21 = new BrandItem();
        brandItem21.setImage("https://www.e3melbusiness.com/assets/images/success-story-Marzouga(1).png");
        data.add(21,brandItem21);
        BrandItem brandItem22 = new BrandItem();
        brandItem22.setImage("https://www.expressoplus.com/ep/wp-content/uploads/2018/11/nescafe-coffee-to-go-logo.jpg");
        data.add(22,brandItem22);
        BrandItem brandItem23 = new BrandItem();
        brandItem23.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQQUPJaz5QvvUckrU5vp4w1w5uRw8mD11HtencThUn2mpakkSz5oA");
        data.add(23,brandItem23);


        /*
        for (int i = 0; i <= 26; i++) {
            BrandItem brandItem = new BrandItem();
            brandItem.setImage("http://pngimg.com/uploads/water_bottle/water_bottle_PNG10147.png");
            data.add(brandItem);

        }*/
    }

    public List<BrandItem> getData() {
        return data;
    }

    public void setData(List<BrandItem> data) {
        this.data = data;
    }

    @Override
    public List<BrandItem> getPage(int page) //paging : 9 per page
    {
        int itemsPerPage = 9;
        if (page * itemsPerPage >= data.size()) {
            return new ArrayList<>();
        }
        List<BrandItem> subItems = new ArrayList<>();
        //int looping =allData.size()/paging;
        for (int i = 0; (i < data.size() - page * itemsPerPage & i < 9); i++) {
            BrandItem brandItem;
            // int start=size / (page - 1);
            int start = (itemsPerPage * page)+i;
            brandItem = data.get(start);
            subItems.add(brandItem);

        }
        return subItems;
    }
}
