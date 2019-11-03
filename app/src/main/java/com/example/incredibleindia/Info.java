package com.example.incredibleindia;

import android.content.Context;

import java.util.List;


class Info {

    static void initInfoList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.info),
                context.getString(R.string.info_description),
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                context.getString(R.string.info_stores),
                context.getString(R.string.info_stores_description),
                null,
                null,
                null,
                null,
                -1
        ));

        list.add(new Location(
                context.getString(R.string.info_transportation),
                context.getString(R.string.info_transport_descp),
                null,
                null,
                null,
                null,
                -1
        ));
    }
}
