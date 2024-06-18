// Generated by view binder compiler. Do not edit!
package com.example.puffandpoof.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.puffandpoof.R;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DollListBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView brand;

  @NonNull
  public final CardView carddoll;

  @NonNull
  public final ShapeableImageView imgdoll;

  @NonNull
  public final TextView pricez;

  @NonNull
  public final TextView size;

  @NonNull
  public final TextView ttldol;

  private DollListBinding(@NonNull CardView rootView, @NonNull TextView brand,
      @NonNull CardView carddoll, @NonNull ShapeableImageView imgdoll, @NonNull TextView pricez,
      @NonNull TextView size, @NonNull TextView ttldol) {
    this.rootView = rootView;
    this.brand = brand;
    this.carddoll = carddoll;
    this.imgdoll = imgdoll;
    this.pricez = pricez;
    this.size = size;
    this.ttldol = ttldol;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DollListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DollListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.doll_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DollListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.brand;
      TextView brand = ViewBindings.findChildViewById(rootView, id);
      if (brand == null) {
        break missingId;
      }

      CardView carddoll = (CardView) rootView;

      id = R.id.imgdoll;
      ShapeableImageView imgdoll = ViewBindings.findChildViewById(rootView, id);
      if (imgdoll == null) {
        break missingId;
      }

      id = R.id.pricez;
      TextView pricez = ViewBindings.findChildViewById(rootView, id);
      if (pricez == null) {
        break missingId;
      }

      id = R.id.size;
      TextView size = ViewBindings.findChildViewById(rootView, id);
      if (size == null) {
        break missingId;
      }

      id = R.id.ttldol;
      TextView ttldol = ViewBindings.findChildViewById(rootView, id);
      if (ttldol == null) {
        break missingId;
      }

      return new DollListBinding((CardView) rootView, brand, carddoll, imgdoll, pricez, size,
          ttldol);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
