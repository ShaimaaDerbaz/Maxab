package com.example.shaimaaderbaz.maxabtask.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.shaimaaderbaz.maxabtask.R;
import com.example.shaimaaderbaz.maxabtask.data.models.BrandItem;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BrandsAdapter extends RecyclerView.Adapter<BrandsAdapter.ViewHolder> {
    private List<BrandItem> dataSet;
    public interface BrandsAdapterListener {
        void onItemClicked(int id);

    }

    public BrandsAdapter(List<BrandItem> dataSet) {
        this.dataSet = dataSet;
    }



    public void addItems(List<BrandItem> items) {
        dataSet.addAll(items);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ivBrandImage)
        ImageView brandImage;

        public ViewHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);


        }

        void bind(BrandItem item) {
            //holder.getCatImage().setBackgroundResource(dataSet.get(position).getPatientName());
            String imageUrl = item.getImage();
           /* Picasso.with(context)
                    .load(imageUrl)
                    .placeholder(R.drawable.Water_Bottle_PNG_Image);*/

            Picasso.with(itemView.getContext()).load(imageUrl).into(brandImage);
        }
    }

    @Override
    public BrandsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.brand_item, parent, false);

        return new BrandsAdapter.ViewHolder(v);
    }


    @Override
    public void onBindViewHolder(final BrandsAdapter.ViewHolder holder, int position) {
        if (dataSet.get(position) != null) {
            holder.bind(dataSet.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

}
