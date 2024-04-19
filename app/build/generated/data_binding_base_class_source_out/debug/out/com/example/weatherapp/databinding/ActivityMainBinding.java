// Generated by view binder compiler. Do not edit!
package com.example.weatherapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.weatherapp.R;
import com.google.android.material.navigation.NavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final EditText etLocation;

  @NonNull
  public final FrameLayout frameLayout;

  @NonNull
  public final ImageView ivHumidity;

  @NonNull
  public final ImageView ivRain;

  @NonNull
  public final ImageView ivSunrise;

  @NonNull
  public final ImageView ivSunset;

  @NonNull
  public final ImageView ivWeather;

  @NonNull
  public final ImageView ivWind;

  @NonNull
  public final LinearLayout llThisHour;

  @NonNull
  public final NavigationView navMenu;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final RecyclerView rvFiveDays;

  @NonNull
  public final RecyclerView rvToday;

  @NonNull
  public final ScrollView scrollView;

  @NonNull
  public final TextView tvDescription;

  @NonNull
  public final TextView tvFeels;

  @NonNull
  public final TextView tvHumidity;

  @NonNull
  public final TextView tvRain;

  @NonNull
  public final TextView tvSunrise;

  @NonNull
  public final TextView tvSunset;

  @NonNull
  public final TextView tvTemperature;

  @NonNull
  public final TextView tvWind;

  private ActivityMainBinding(@NonNull DrawerLayout rootView, @NonNull DrawerLayout drawerLayout,
      @NonNull EditText etLocation, @NonNull FrameLayout frameLayout, @NonNull ImageView ivHumidity,
      @NonNull ImageView ivRain, @NonNull ImageView ivSunrise, @NonNull ImageView ivSunset,
      @NonNull ImageView ivWeather, @NonNull ImageView ivWind, @NonNull LinearLayout llThisHour,
      @NonNull NavigationView navMenu, @NonNull ProgressBar progressBar,
      @NonNull RecyclerView rvFiveDays, @NonNull RecyclerView rvToday,
      @NonNull ScrollView scrollView, @NonNull TextView tvDescription, @NonNull TextView tvFeels,
      @NonNull TextView tvHumidity, @NonNull TextView tvRain, @NonNull TextView tvSunrise,
      @NonNull TextView tvSunset, @NonNull TextView tvTemperature, @NonNull TextView tvWind) {
    this.rootView = rootView;
    this.drawerLayout = drawerLayout;
    this.etLocation = etLocation;
    this.frameLayout = frameLayout;
    this.ivHumidity = ivHumidity;
    this.ivRain = ivRain;
    this.ivSunrise = ivSunrise;
    this.ivSunset = ivSunset;
    this.ivWeather = ivWeather;
    this.ivWind = ivWind;
    this.llThisHour = llThisHour;
    this.navMenu = navMenu;
    this.progressBar = progressBar;
    this.rvFiveDays = rvFiveDays;
    this.rvToday = rvToday;
    this.scrollView = scrollView;
    this.tvDescription = tvDescription;
    this.tvFeels = tvFeels;
    this.tvHumidity = tvHumidity;
    this.tvRain = tvRain;
    this.tvSunrise = tvSunrise;
    this.tvSunset = tvSunset;
    this.tvTemperature = tvTemperature;
    this.tvWind = tvWind;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.etLocation;
      EditText etLocation = ViewBindings.findChildViewById(rootView, id);
      if (etLocation == null) {
        break missingId;
      }

      id = R.id.frameLayout;
      FrameLayout frameLayout = ViewBindings.findChildViewById(rootView, id);
      if (frameLayout == null) {
        break missingId;
      }

      id = R.id.ivHumidity;
      ImageView ivHumidity = ViewBindings.findChildViewById(rootView, id);
      if (ivHumidity == null) {
        break missingId;
      }

      id = R.id.ivRain;
      ImageView ivRain = ViewBindings.findChildViewById(rootView, id);
      if (ivRain == null) {
        break missingId;
      }

      id = R.id.ivSunrise;
      ImageView ivSunrise = ViewBindings.findChildViewById(rootView, id);
      if (ivSunrise == null) {
        break missingId;
      }

      id = R.id.ivSunset;
      ImageView ivSunset = ViewBindings.findChildViewById(rootView, id);
      if (ivSunset == null) {
        break missingId;
      }

      id = R.id.ivWeather;
      ImageView ivWeather = ViewBindings.findChildViewById(rootView, id);
      if (ivWeather == null) {
        break missingId;
      }

      id = R.id.ivWind;
      ImageView ivWind = ViewBindings.findChildViewById(rootView, id);
      if (ivWind == null) {
        break missingId;
      }

      id = R.id.llThisHour;
      LinearLayout llThisHour = ViewBindings.findChildViewById(rootView, id);
      if (llThisHour == null) {
        break missingId;
      }

      id = R.id.navMenu;
      NavigationView navMenu = ViewBindings.findChildViewById(rootView, id);
      if (navMenu == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.rvFiveDays;
      RecyclerView rvFiveDays = ViewBindings.findChildViewById(rootView, id);
      if (rvFiveDays == null) {
        break missingId;
      }

      id = R.id.rvToday;
      RecyclerView rvToday = ViewBindings.findChildViewById(rootView, id);
      if (rvToday == null) {
        break missingId;
      }

      id = R.id.scrollView;
      ScrollView scrollView = ViewBindings.findChildViewById(rootView, id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.tvDescription;
      TextView tvDescription = ViewBindings.findChildViewById(rootView, id);
      if (tvDescription == null) {
        break missingId;
      }

      id = R.id.tvFeels;
      TextView tvFeels = ViewBindings.findChildViewById(rootView, id);
      if (tvFeels == null) {
        break missingId;
      }

      id = R.id.tvHumidity;
      TextView tvHumidity = ViewBindings.findChildViewById(rootView, id);
      if (tvHumidity == null) {
        break missingId;
      }

      id = R.id.tvRain;
      TextView tvRain = ViewBindings.findChildViewById(rootView, id);
      if (tvRain == null) {
        break missingId;
      }

      id = R.id.tvSunrise;
      TextView tvSunrise = ViewBindings.findChildViewById(rootView, id);
      if (tvSunrise == null) {
        break missingId;
      }

      id = R.id.tvSunset;
      TextView tvSunset = ViewBindings.findChildViewById(rootView, id);
      if (tvSunset == null) {
        break missingId;
      }

      id = R.id.tvTemperature;
      TextView tvTemperature = ViewBindings.findChildViewById(rootView, id);
      if (tvTemperature == null) {
        break missingId;
      }

      id = R.id.tvWind;
      TextView tvWind = ViewBindings.findChildViewById(rootView, id);
      if (tvWind == null) {
        break missingId;
      }

      return new ActivityMainBinding((DrawerLayout) rootView, drawerLayout, etLocation, frameLayout,
          ivHumidity, ivRain, ivSunrise, ivSunset, ivWeather, ivWind, llThisHour, navMenu,
          progressBar, rvFiveDays, rvToday, scrollView, tvDescription, tvFeels, tvHumidity, tvRain,
          tvSunrise, tvSunset, tvTemperature, tvWind);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
