package com.nothcoders.northcodersrestaurant;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.nothcoders.northcodersrestaurant.model.FoodItem;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private List<FoodItem> foodItemList;

    // Constructor
    public ItemAdapter(List<FoodItem> foodItemList) {
        this.foodItemList = foodItemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate the item_layout.xml
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        // Get the food item at the current position
        FoodItem currentItem = foodItemList.get(position);

        // Bind the data to the views
        holder.itemImage.setImageResource(currentItem.getItemImg());
        holder.itemName.setText(currentItem.getItemName());
        holder.itemDescription.setText(currentItem.getItemDescription());
        holder.itemPrice.setText(String.format("£%.2f", currentItem.getItemPrice()));
    }

    @Override
    public int getItemCount() {
        return foodItemList.size();
    }

    // Inner static class for the ViewHolder
    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        ImageView itemImage;
        TextView itemName;
        TextView itemDescription;
        TextView itemPrice;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.item_image);
            itemName = itemView.findViewById(R.id.item_name);
            itemDescription = itemView.findViewById(R.id.item_description);
            itemPrice = itemView.findViewById(R.id.item_price);
        }
    }
}