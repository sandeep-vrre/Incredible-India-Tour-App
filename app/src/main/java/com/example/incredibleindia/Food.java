package com.example.incredibleindia;

import android.content.Context;

import java.util.List;


public class Food {

    public static void initFoodsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.food_biriyani),
                context.getString(R.string.food_biriyani_description),
                context.getString(R.string.food_biriyani_address),
                context.getString(R.string.food_biriyani_phone),
                context.getString(R.string.food_biriyani_sch),
                context.getString(R.string.biriyani_price),
                R.drawable.foodie_biriyani
        ));

        list.add(new Location(
                context.getString(R.string.food_southindian_special),
                context.getString(R.string.food_southindian_description),
                context.getString(R.string.food_southindian_address),
                context.getString(R.string.food_southindian_phone),
                context.getString(R.string.food_southindian_schedule),
                context.getString(R.string.sweet_price),
                R.drawable.foodie_veg1
        ));

        list.add(new Location(
                context.getString(R.string.food_sweet),
                context.getString(R.string.food_sweet_description),
                context.getString(R.string.food_sweet_address),
                context.getString(R.string.food_sweet_phone),
                context.getString(R.string.food_sweet_schedule),
                context.getString(R.string.food_sweet_schedule),
                R.drawable.foodie_sweet1
        ));

        list.add(new Location(
                context.getString(R.string.food_paneer),
                context.getString(R.string.paneer_description),
                context.getString(R.string.paneer_address),
                context.getString(R.string.paneer_phone),
                context.getString(R.string.paneer_schedule),
                context.getString(R.string.psneer_price),
                R.drawable.foodie_paneer
        ));

        list.add(new Location(
                context.getString(R.string.food_chan_masala),
                context.getString(R.string.chan_description),
                context.getString(R.string.chan_address),
                context.getString(R.string.chan_phone),
                context.getString(R.string.chan_schedule),
                context.getString(R.string.sweet_price),
                R.drawable.foodie_chanmasala_aloo_matar
        ));

        list.add(new Location(
                context.getString(R.string.food_veg2),
                context.getString(R.string.veg2_description),
                context.getString(R.string.veg2_address),
                context.getString(R.string.veg2_phone),
                context.getString(R.string.veg2_schedule),
                context.getString(R.string.biriyani_price),
                R.drawable.foodie_veg2
        ));

        list.add(new Location(
                context.getString(R.string.food_thali),
                context.getString(R.string.thali_description),
                context.getString(R.string.thali_address),
                context.getString(R.string.thali_phone),
                context.getString(R.string.thali_schedule),
                context.getString(R.string.psneer_price),
                R.drawable.foodie_thali
        ));
    }
}
