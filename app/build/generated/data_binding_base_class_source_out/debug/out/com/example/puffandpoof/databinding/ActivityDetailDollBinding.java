// Generated by view binder compiler. Do not edit!
package com.example.puffandpoof.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.puffandpoof.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailDollBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button addToCartButton;

  @NonNull
  public final Button backhome;

  @NonNull
  public final TextView braaand;

  @NonNull
  public final TextView descTV;

  @NonNull
  public final ImageView dtldoll;

  @NonNull
  public final NumberPicker quantityPicker;

  @NonNull
  public final RadioButton rbHS;

  @NonNull
  public final TextView sizel;

  @NonNull
  public final TextView ttl;

  private ActivityDetailDollBinding(@NonNull LinearLayout rootView, @NonNull Button addToCartButton,
      @NonNull Button backhome, @NonNull TextView braaand, @NonNull TextView descTV,
      @NonNull ImageView dtldoll, @NonNull NumberPicker quantityPicker, @NonNull RadioButton rbHS,
      @NonNull TextView sizel, @NonNull TextView ttl) {
    this.rootView = rootView;
    this.addToCartButton = addToCartButton;
    this.backhome = backhome;
    this.braaand = braaand;
    this.descTV = descTV;
    this.dtldoll = dtldoll;
    this.quantityPicker = quantityPicker;
    this.rbHS = rbHS;
    this.sizel = sizel;
    this.ttl = ttl;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailDollBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailDollBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail_doll, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailDollBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_to_cart_button;
      Button addToCartButton = ViewBindings.findChildViewById(rootView, id);
      if (addToCartButton == null) {
        break missingId;
      }

      id = R.id.backhome;
      Button backhome = ViewBindings.findChildViewById(rootView, id);
      if (backhome == null) {
        break missingId;
      }

      id = R.id.braaand;
      TextView braaand = ViewBindings.findChildViewById(rootView, id);
      if (braaand == null) {
        break missingId;
      }

      id = R.id.descTV;
      TextView descTV = ViewBindings.findChildViewById(rootView, id);
      if (descTV == null) {
        break missingId;
      }

      id = R.id.dtldoll;
      ImageView dtldoll = ViewBindings.findChildViewById(rootView, id);
      if (dtldoll == null) {
        break missingId;
      }

      id = R.id.quantity_picker;
      NumberPicker quantityPicker = ViewBindings.findChildViewById(rootView, id);
      if (quantityPicker == null) {
        break missingId;
      }

      id = R.id.rbHS;
      RadioButton rbHS = ViewBindings.findChildViewById(rootView, id);
      if (rbHS == null) {
        break missingId;
      }

      id = R.id.sizel;
      TextView sizel = ViewBindings.findChildViewById(rootView, id);
      if (sizel == null) {
        break missingId;
      }

      id = R.id.ttl;
      TextView ttl = ViewBindings.findChildViewById(rootView, id);
      if (ttl == null) {
        break missingId;
      }

      return new ActivityDetailDollBinding((LinearLayout) rootView, addToCartButton, backhome,
          braaand, descTV, dtldoll, quantityPicker, rbHS, sizel, ttl);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
