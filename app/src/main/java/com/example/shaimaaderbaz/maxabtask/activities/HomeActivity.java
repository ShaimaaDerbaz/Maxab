package com.example.shaimaaderbaz.maxabtask.activities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.shaimaaderbaz.maxabtask.R;
import com.example.shaimaaderbaz.maxabtask.adapters.BrandsAdapter;
import com.example.shaimaaderbaz.maxabtask.adapters.CategoriesAdapter;
import com.example.shaimaaderbaz.maxabtask.data.BrandsRepositry;
import com.example.shaimaaderbaz.maxabtask.data.CategoriessRepositry;
import com.example.shaimaaderbaz.maxabtask.data.PaginationScrollListener;
import com.example.shaimaaderbaz.maxabtask.data.models.BrandItem;
import com.example.shaimaaderbaz.maxabtask.data.models.CategoryItem;
import com.example.shaimaaderbaz.maxabtask.presnenters.HomePresenterImp;
import com.example.shaimaaderbaz.maxabtask.views.HomeView;

import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity implements HomeView {

    @BindView(R.id.recyclerViewBrands)
    RecyclerView recyclerViewBrands;

    @BindView(R.id.recyclerViewCategories)
    RecyclerView recyclerViewCategories;

    @BindView(R.id.leftButton)
    Button leftButton;

    @BindView(R.id.rightButton)
    Button rightButton;

    List<CategoryItem> categoryItems;
    CategoriesAdapter categoriesAdapter;
    HomePresenterImp presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String languageToLoad  = "ar"; // your language
        Locale locale = new Locale(languageToLoad);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());

        setContentView(R.layout.activity_home);

        ButterKnife.bind(this);

        presenter = new HomePresenterImp(this, new BrandsRepositry(), new CategoriessRepositry());
        presenter.getAnotherBrandsPage();
        presenter.getAnotherCategoriesPage();


    }

    @Override
    public void showBrands(List<BrandItem> brandItemsData) {
        final GridLayoutManager layoutManager = new GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false);
        if (recyclerViewBrands.getAdapter() == null) {

            recyclerViewBrands.setLayoutManager(layoutManager);
            recyclerViewBrands.setHasFixedSize(true);
            BrandsAdapter brandsAdapter = new BrandsAdapter(brandItemsData);
            recyclerViewBrands.setAdapter(brandsAdapter);
            recyclerViewBrands.addOnScrollListener(new PaginationScrollListener(layoutManager) {
                @Override
                public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                    presenter.getAnotherBrandsPage();
                }
            });
            rightButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recyclerViewBrands.getLayoutManager().scrollToPosition(layoutManager.findLastVisibleItemPosition() + 1);

                }
            });

            leftButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    recyclerViewBrands.getLayoutManager().scrollToPosition(layoutManager.findFirstVisibleItemPosition() - 1);
                }
            });
        } else {
            ((BrandsAdapter) recyclerViewBrands.getAdapter()).addItems(brandItemsData);
        }


    }

    @Override
    public void showCategoris(List<CategoryItem> categoriesItemsData) {
        if (recyclerViewCategories.getAdapter() == null) {
            GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
            recyclerViewCategories.setLayoutManager(layoutManager);
            recyclerViewCategories.setHasFixedSize(true);
            categoriesAdapter = new CategoriesAdapter(categoriesItemsData);
            recyclerViewCategories.setAdapter(categoriesAdapter);
            recyclerViewCategories.addOnScrollListener(
                    new PaginationScrollListener(layoutManager) {
                        @Override
                        public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                            presenter.getAnotherCategoriesPage();
                        }
                    });
        } else {
            ((CategoriesAdapter) recyclerViewCategories.getAdapter()).addItems(categoriesItemsData);
        }

    }

}
