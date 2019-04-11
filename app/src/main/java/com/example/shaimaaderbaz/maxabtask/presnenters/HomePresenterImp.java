package com.example.shaimaaderbaz.maxabtask.presnenters;

import com.example.shaimaaderbaz.maxabtask.data.BrandsDataCall;
import com.example.shaimaaderbaz.maxabtask.data.CategoriesDataCall;
import com.example.shaimaaderbaz.maxabtask.data.CategoriessRepositry;
import com.example.shaimaaderbaz.maxabtask.data.Repository;
import com.example.shaimaaderbaz.maxabtask.data.models.BrandItem;
import com.example.shaimaaderbaz.maxabtask.data.models.CategoryItem;
import com.example.shaimaaderbaz.maxabtask.views.HomeView;

import java.util.List;

/**
 * Created by Shaimaa Derbaz on 4/8/2019.
 */

public class HomePresenterImp implements HomePresenter {

    private final Repository<BrandItem> brandsRepo;

    private final Repository<CategoryItem> categoriesRepo;

    private HomeView homeView;

    private int currentBrandsPage = 0;

    private int currentCategoriesPage = 0;

    public HomePresenterImp(HomeView homeView, Repository<BrandItem> brandsRepo,
                            Repository<CategoryItem> categoryRepo) {
        this.homeView = homeView;
        this.brandsRepo = brandsRepo;
        this.categoriesRepo = categoryRepo;
    }

    BrandsDataCall presenterBrandCallback = new BrandsDataCall() {
        @Override
        public void success(List<BrandItem> brandItems) {
            homeView.showBrands(brandItems);
        }

        @Override
        public void error(String error) {

        }
    };


    CategoriesDataCall presenterCategoryCallback = new CategoriesDataCall() {
        @Override
        public void success(List<CategoryItem> categoryItems) {
            homeView.showCategoris(categoryItems);
        }

        @Override
        public void error(String error) {

        }
    };


    @Override
    public void getAnotherBrandsPage() {
        List<BrandItem> brandItems = brandsRepo.getPage(currentBrandsPage);
        homeView.showBrands(brandItems);
        currentBrandsPage++;
    }

    @Override
    public void getAnotherCategoriesPage() {
        CategoriessRepositry categoriessRepositry = new CategoriessRepositry();
        homeView.showCategoris(categoriessRepositry.getPage(currentCategoriesPage));
        currentCategoriesPage++;

    }
}
