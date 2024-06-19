package com.nothcoders.northcodersrestaurant;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nothcoders.northcodersrestaurant.model.FoodItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<FoodItem> foodItemList;
    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerView);

        // Set up LayoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Initialize the data source
        foodItemList = new ArrayList<>();

        // Create FoodItem objects and add them to the list
        FoodItem burger = new FoodItem(R.drawable.burger, "Burger", "Our burgers are made with 100% Aberdeen Angus beef, char-grilled to perfection, and served with our in-house relish on a brioche bun", 10.99);
        FoodItem pizza = new FoodItem(R.drawable.pizza, "Pizza", "Cheesy pepperoni pizza with a crispy crust", 12.50);
        FoodItem burrito = new FoodItem(R.drawable.burrito, "Burrito", "Fresh Burrito", 7.00);
        FoodItem cupcake = new FoodItem(R.drawable.cupcake, "Cupcake", "Cupcake Description", 1.99);
        FoodItem sandwich = new FoodItem(R.drawable.sandwich,"Sandwich","Sandwich Description",1.79);
        FoodItem doughnut = new FoodItem(R.drawable.doughnut, "Doughnut", "Doughnut Description", 1.50);
        FoodItem frenchFries = new FoodItem(R.drawable.french_fries,"French Fries","French FriesDescription",.99);
        FoodItem hotDog = new FoodItem(R.drawable.hot_dog,"Hot dogs","Hotdog Description",1.79);
        FoodItem iceCream = new FoodItem(R.drawable.ice_cream,"Ice Cream","Ice Cream Description",3.39);
        FoodItem ramen = new FoodItem(R.drawable.ramen,"Ramen","Ramen Description",3.39);

        // Add the food items to the list
        foodItemList.add(burger);
        foodItemList.add(pizza);
        foodItemList.add(burrito);
        foodItemList.add(cupcake);
        foodItemList.add(doughnut);
        foodItemList.add(sandwich);
        foodItemList.add(frenchFries);
        foodItemList.add(hotDog);
        foodItemList.add(iceCream);
        foodItemList.add(ramen);

        // Initialize the adapter with the food item list
        itemAdapter = new ItemAdapter(foodItemList);

        // Set the adapter to the RecyclerView
        recyclerView.setAdapter(itemAdapter);
    }
}