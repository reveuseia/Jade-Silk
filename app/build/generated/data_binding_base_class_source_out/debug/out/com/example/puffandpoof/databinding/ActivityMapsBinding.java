// Generated by view binder compiler. Do not edit!
package com.example.puffandpoof.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.puffandpoof.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMapsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView headerTextView;

  @NonNull
  public final TextView messageTextView;

  @NonNull
  public final Button yesButton;

  private ActivityMapsBinding(@NonNull RelativeLayout rootView, @NonNull TextView headerTextView,
      @NonNull TextView messageTextView, @NonNull Button yesButton) {
    this.rootView = rootView;
    this.headerTextView = headerTextView;
    this.messageTextView = messageTextView;
    this.yesButton = yesButton;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMapsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_maps, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMapsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.headerTextView;
      TextView headerTextView = ViewBindings.findChildViewById(rootView, id);
      if (headerTextView == null) {
        break missingId;
      }

      id = R.id.messageTextView;
      TextView messageTextView = ViewBindings.findChildViewById(rootView, id);
      if (messageTextView == null) {
        break missingId;
      }

      id = R.id.yesButton;
      Button yesButton = ViewBindings.findChildViewById(rootView, id);
      if (yesButton == null) {
        break missingId;
      }

      return new ActivityMapsBinding((RelativeLayout) rootView, headerTextView, messageTextView,
          yesButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
