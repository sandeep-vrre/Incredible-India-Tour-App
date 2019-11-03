package com.example.incredibleindia;

import android.content.Context;

import java.util.List;


class Sights {

    static void initSightsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.t_akshardham),
                context.getString(R.string.t_akshardham_desp),
                context.getString(R.string.t_akshardham_address),
                context.getString(R.string.t_akshardham_phone),
                context.getString(R.string.t_akshardham_schedule),
                context.getString(R.string.t_akshardham_price),
                R.drawable.t_akshardham
        ));

        list.add(new Location(
                context.getString(R.string.t_vidhana_soudha),
                context.getString(R.string.t_vidhana_soudha_desp),
                context.getString(R.string.t_vidhana_soudha_address),
                context.getString(R.string.t_vidhana_soudha_phone),
                context.getString(R.string.t_vidhana_soudha_schedule),
                context.getString(R.string.t_vidhana_soudha_cost),
                R.drawable.t_vidhana_soudha
        ));

        list.add(new Location(
                context.getString(R.string.t_jagmandir),
                context.getString(R.string.t_jagmandir_desp),
                context.getString(R.string.t_jagmandir_address),
                context.getString(R.string.t_jagmandir_phone),
                context.getString(R.string.t_jagmandir_schedule),
                context.getString(R.string.t_jagmandir_cost),
                R.drawable.t_jagmandir
        ));

        list.add(new Location(
                context.getString(R.string.t_north_east),
                context.getString(R.string.t_north_east_description),
                context.getString(R.string.t_north_east_address),
                context.getString(R.string.t_north_east_phone),
                context.getString(R.string.t_north_east_schedule),
                context.getString(R.string.t_north_east_cost),
                R.drawable.t_north_east
        ));

        list.add(new Location(
                context.getString(R.string.t_tijara),
                context.getString(R.string.t_tijara_desp),
                context.getString(R.string.t_tijara_address),
                context.getString(R.string.t_tijara_phone),
                context.getString(R.string.t_tijara_schedule),
                context.getString(R.string.t_tijara),
                R.drawable.t_tijara
        ));

        list.add(new Location(
                context.getString(R.string.t_rambagh_palace),
                context.getString(R.string.t_rambagh_desp),
                context.getString(R.string.t_rambagh_address),
                context.getString(R.string.t_rambagh_phone),
                context.getString(R.string.t_rambagh_schedule),
                context.getString(R.string.t_rambagh_palace),
                R.drawable.t_rambagh_palace_jaipur
        ));

        list.add(new Location(
                context.getString(R.string.t_lakshmivilas),
                context.getString(R.string.t_lakshmivilas_description),
                context.getString(R.string.t_lakshmivilas_address),
                context.getString(R.string.t_lakshmivilas_phone),
                context.getString(R.string.t_lakshmivilas_schedule),
                context.getString(R.string.t_lakshmivilas),
                R.drawable.lakshmi_vilas_paloace
        ));
    }
}
