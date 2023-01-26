// Generated by view binder compiler. Do not edit!
package com.example.flexfitnessgymmanagement.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.flexfitnessgymmanagement.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityHomePageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button continueButton;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView txt;

  @NonNull
  public final TextView txt2;

  private ActivityHomePageBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button continueButton, @NonNull TextView textView2, @NonNull TextView txt,
      @NonNull TextView txt2) {
    this.rootView = rootView;
    this.continueButton = continueButton;
    this.textView2 = textView2;
    this.txt = txt;
    this.txt2 = txt2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityHomePageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_home_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityHomePageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.continueButton;
      Button continueButton = ViewBindings.findChildViewById(rootView, id);
      if (continueButton == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.txt;
      TextView txt = ViewBindings.findChildViewById(rootView, id);
      if (txt == null) {
        break missingId;
      }

      id = R.id.txt2;
      TextView txt2 = ViewBindings.findChildViewById(rootView, id);
      if (txt2 == null) {
        break missingId;
      }

      return new ActivityHomePageBinding((ConstraintLayout) rootView, continueButton, textView2,
          txt, txt2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}