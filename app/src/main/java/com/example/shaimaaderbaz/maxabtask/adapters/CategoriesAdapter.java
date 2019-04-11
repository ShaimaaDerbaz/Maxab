package com.example.shaimaaderbaz.maxabtask.adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shaimaaderbaz.maxabtask.R;
import com.example.shaimaaderbaz.maxabtask.data.models.CategoryItem;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Shaimaa Derbaz on 4/8/2019.
 */

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.ViewHolder> {

    private List<CategoryItem> dataSet;

    public CategoriesAdapter(List<CategoryItem> dataSet) {
        this.dataSet = dataSet;
    }

    public void addItems(List<CategoryItem> items) {
        dataSet.addAll(items);
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ivCatImage)
        ImageView catImage;
        @BindView(R.id.ivItemIcon)
        ImageView catIcon;
        @BindView(R.id.textViewItemName)
        TextView catName;


        public ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);

        }

        void bind(CategoryItem item) {
            String imageCatUrl = item.getImage();
            Picasso.with(itemView.getContext()).load(imageCatUrl).into(catImage);
            String iconCatUrl = item.getIcon();
            Picasso.with(itemView.getContext()).load(iconCatUrl).into(catIcon);
            catName.setText(item.getName() + "");
        }
    }

    @Override
    public CategoriesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_item, parent, false);

        return new CategoriesAdapter.ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(final CategoriesAdapter.ViewHolder holder, int position) {
        if (dataSet.get(position) != null) {
            Log.d("", "Element " + position + " set.");
            holder.bind(dataSet.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

}
