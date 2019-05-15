package com.example.asus.appwidgetsample;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RemoteViews;

import java.util.Calendar;

/**
 * Implementation of App Widget functionality.
 */
public class NewAppWidget extends AppWidgetProvider {
    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {
        Calendar calendar = Calendar.getInstance();
        int thisDay;
        CharSequence tarih="..";
        CharSequence yemek_listesi_text="..";
        thisDay = calendar.get(Calendar.DAY_OF_MONTH);
        if(thisDay==15)
        {
            tarih ="15.05.2019";
            yemek_listesi_text =context.getString(R.string.yemek_15);
        }
        if(thisDay==16)
        {
             tarih ="16.05.2019";
             yemek_listesi_text =context.getString(R.string.yemek_16);
        }
        if(thisDay==17)
        {
            tarih ="17.05.2019";
            yemek_listesi_text =context.getString(R.string.yemek_17);
        }
        if(thisDay==18)
        {
            tarih ="18.05.2019";
            yemek_listesi_text ="Tatil";
        }
        if(thisDay==19)
        {
            tarih ="19.05.2019";
            yemek_listesi_text ="Tatil";
        }
        if(thisDay==20)
        {
            tarih ="20.05.2019";
            yemek_listesi_text =context.getString(R.string.yemek_20);
        }
        if(thisDay==21)
        {
            tarih ="21.05.2019";
            yemek_listesi_text =context.getString(R.string.yemek_21);
        }
        if(thisDay==22)
        {
            tarih ="22.05.2019";
            yemek_listesi_text =context.getString(R.string.yemek_22);
        }
        if(thisDay==23)
        {
            tarih ="23.05.2019";
            yemek_listesi_text =context.getString(R.string.yemek_23);
        }
        if(thisDay==24)
        {
            tarih ="24.05.2019";
            yemek_listesi_text =context.getString(R.string.yemek_24);
        }
        if(thisDay==25)
        {
            tarih ="25.05.2019";
            yemek_listesi_text ="Tatil";
        }
        if(thisDay==26)
        {
            tarih ="26.05.2019";
            yemek_listesi_text ="Tatil";
        }
        if(thisDay==27)
        {
            tarih ="27.05.2019";
            yemek_listesi_text =context.getString(R.string.yemek_27);
        }
        if(thisDay==28)
        {
            tarih ="28.05.2019";
            yemek_listesi_text =context.getString(R.string.yemek_28);
        }
        if(thisDay==29)
        {
            tarih ="29.05.2019";
            yemek_listesi_text =context.getString(R.string.yemek_29);
        }
        if(thisDay==30)
        {
            tarih ="30.05.2019";
            yemek_listesi_text =context.getString(R.string.yemek_30);
        }
        if(thisDay==31)
        {
            tarih ="31.05.2019";
            yemek_listesi_text =context.getString(R.string.yemek_31);
        }
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.new_app_widget);
        views.setTextViewText(R.id.tarih,tarih);
        views.setTextViewText(R.id.yemek_listesi,yemek_listesi_text);

        Intent intentUpdate = new Intent(context, NewAppWidget.class);
        intentUpdate.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
        int[] idArray = new int[]{appWidgetId};
        intentUpdate.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, idArray);
        PendingIntent pendingUpdate = PendingIntent.getBroadcast(context,
                appWidgetId, intentUpdate, PendingIntent.FLAG_UPDATE_CURRENT);

        views.setOnClickPendingIntent(R.id.guncelle, pendingUpdate);
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
    }


}

