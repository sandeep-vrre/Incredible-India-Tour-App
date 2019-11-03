package com.example.incredibleindia;

import android.content.Context;

import com.example.incredibleindia.Location;
import com.example.incredibleindia.R;

import java.util.List;


public class Shops {

    public static void initShopsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.shopping_commercial_street),
                context.getString(R.string.shopping_commercial_street_desp),
                context.getString(R.string.shop_commercial_st_address),
                context.getString(R.string.shop_commercial_st_phn),
                context.getString(R.string.shop_commercial_st_schedule),
                null,
                R.drawable.shopping_commercialstreet_banglore
        ));

        list.add(new Location(
                context.getString(R.string.shopping_arpora),
                context.getString(R.string.shopping_arpora_descp),
                context.getString(R.string.shopping_arpora_address),
                context.getString(R.string.shopping_arpora_phn),
                context.getString(R.string.shopping_arpora_schedule),
                null,
                R.drawable.shopping_goa_nightmarket
        ));

        list.add(new Location(
                context.getString(R.string.shopping_cybercity),
                context.getString(R.string.shopping_cybercity_desp),
                context.getString(R.string.shopping_cybercity_address),
                context.getString(R.string.shopping_cybercity_phn),
                context.getString(R.string.shopping_cybercity_schedule),
                null,
                R.drawable.shopping_cybercity
        ));

        list.add(new Location(
                context.getString(R.string.shopping_kishan),
                context.getString(R.string.shopping_kishan_desp),
                context.getString(R.string.shopping_kishan_address),
                context.getString(R.string.shopping_kishan_phn),
                context.getString(R.string.shopping_kishan_schedule),
                null,
                R.drawable.shopping_kishan_bazaar
        ));

        list.add(new Location(
                context.getString(R.string.Shopping_lake_pichola),
                context.getString(R.string.Shopping_lake_pichola_desp),
                context.getString(R.string.Shopping_lake_pichola_address),
                context.getString(R.string.Shopping_lake_pichola_phn),
                context.getString(R.string.Shopping_lake_pichola_schedule),
                null,
                R.drawable.lake_pichola
        ));

        list.add(new Location(
                context.getString(R.string.shopping_phoenix),
                context.getString(R.string.shopping_phoenix_desp),
                context.getString(R.string.shopping_phoenix_address),
                context.getString(R.string.shopping_phoenix_phn),
                context.getString(R.string.shopping_phoenix_schedule),
                null,
                R.drawable.shopping_phoenix_marketcity
        ));

        list.add(new Location(
                context.getString(R.string.shopping_police_bazaar),
                context.getString(R.string.shopping_police_bazaar_desp),
                context.getString(R.string.shopping_police_bazaar_address),
                context.getString(R.string.shopping_police_bazaar_phn),
                context.getString(R.string.shopping_police_bazaar_schedule),
                null,
                R.drawable.shopping_policebazaar
        ));

        list.add(new Location(
                context.getString(R.string.shopping_jodpur),
                context.getString(R.string.shopping_jodpur_description),
                context.getString(R.string.shopping_jodpur_address),
                context.getString(R.string.shopping_jodpur_phone),
                context.getString(R.string.shop_biccamera_schedule),
                null,
                R.drawable.shopping_jodpur_evening_market
        ));

        list.add(new Location(
                context.getString(R.string.Shopping_chai),
                context.getString(R.string.Shopping_chai_desp),
                context.getString(R.string.Shopping_chai_address),
                context.getString(R.string.Shopping_chai_phn),
                context.getString(R.string.Shopping_chai_schedule),
                null,
                R.drawable.tea
        ));
    }
}
